//Hafsa Salman
//DSA Lab 01: Task no. 06

import java.util.Objects;
import java.util.Scanner;

public class Task_06
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 01: Task no. 06");
        System.out.println();

        Scanner s = new Scanner(System.in);

        String [] arr = new String[7];

        System.out.println("Enter 6 fruits and 1 person name randomly in between: ");
        for (int i=0; i<arr.length; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            arr[i] = s.nextLine();
        }

        System.out.println("Printing Array: ");
        print(arr);

        System.out.print("\n\nEnter the person name: ");
        String name = s.nextLine();

        for (int i=0; i<arr.length; i++)
        {
            if (Objects.equals(arr[i], name))
            {
                arr[i] = "Orange";
                break;
            }
        }

        System.out.println("\nPrinting Edited Array: ");
        print(arr);
    }

    public static void print (String [] arr)
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

//Declare the Dynamic array and ask the user to give 6 names of fruits and any name of person
//randomly. Now, replace the name of person with “orange”. And print the updated array.