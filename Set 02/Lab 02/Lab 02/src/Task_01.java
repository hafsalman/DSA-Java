//Hafsa Salman
//DSA Lab 02: Task no. 01

import java.util.Scanner;

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 02: Task no. 01");
        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = s.nextInt();

        int [] arr = new int [size];

        System.out.println("Enter elements: ");
        for (int i=0; i<size; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            arr[i] = s.nextInt();
        }

        int [] even = new int [size];
        int [] odd = new int [size];

        int eCount = 0, oCount = 0;

        for (int i=0; i<size; i++)
        {
            if (arr[i] % 2 == 0)
            {
                even[eCount] = arr[i];
                eCount++;
            }

            else
            {
                odd[oCount] = arr[i];
                oCount++;
            }
        }

        System.out.println("\nPrinting Arrays: ");
        print(arr, size);

        System.out.println("\nPrinting Even Arrays: ");
        print(even, eCount);

        System.out.println("\nPrinting Odd Arrays: ");
        print(odd, oCount);
    }

    public static void print(int[] arr, int count)
    {
        for (int i=0; i<count; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}