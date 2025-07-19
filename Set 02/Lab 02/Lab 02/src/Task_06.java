//Hafsa Salman
//DSA Lab 02: Task no. 06

import java.util.Scanner;

public class Task_06
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 02: Task no. 06");
        System.out.println();

        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = s.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            arr[i] = s.nextInt();
        }

        System.out.println("Printing Original Array: ");
        print(arr, n);

        modifiedBubbleSort(arr, n);

        System.out.println("\nPrinting Sorted Array: ");
        print(arr, n);
    }

    public static void modifiedBubbleSort(int [] arr, int n)
    {
        boolean swapped;

        for (int i=0; i<n; i++)
        {
            swapped = false;

            for (int j=0; j<n-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }

            if (!swapped)
            {
                break;
            }
        }
    }

    public static void print (int [] arr, int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}