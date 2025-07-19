//Hafsa Salman
//DSA Lab 02: Task no. 02

import java.util.Scanner;

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 02: Task no. 02");
        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of the first array: ");
        int size1 = s.nextInt();

        int [] arr1 = new int[size1];

        System.out.println("Enter elements: ");
        for (int i=0; i<size1; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            arr1[i] = s.nextInt();
        }

        System.out.print("Enter size of the second array: ");
        int size2 = s.nextInt();

        int [] arr2 = new int [size2];

        System.out.println("Enter elements: ");
        for (int i=0; i<size2; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            arr2[i] = s.nextInt();
        }

        int com = 0;
        int [] common = new int [100];

        System.out.println("Printing First Array: ");
        print(arr1, size1);

        System.out.println("\nPrinting Second Array: ");
        print(arr2, size2);

        for (int i=0; i<size1; i++)
        {
            for (int j=0; j<size2; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    common[com] = arr1[i];
                    com++;
                }
            }
        }

        System.out.println("\nPrinting Common Elements: ");
        print(common, com);
    }

    public static void print(int[] arr, int size)
    {
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

//Declare two arrays and initialize them at run time after that find the common elements from
//both. And make separate array for common elements.