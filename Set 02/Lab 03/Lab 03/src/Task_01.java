//Hafsa Salman
//DSA Lab 03: Task no. 01

import java.util.Scanner;

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 03: Task no. 01");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int [] arr = new int [10];

        System.out.println("Enter 10 elements in array: ");
        for (int i=0; i<10; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
            arr[i] = s.nextInt();
        }

        System.out.println("\nPrinting Original Array: ");
        print(arr, 10);

        selectionSort(arr);

        System.out.println("\nPrinting Four Minimum Elements:");
        print(arr, 4);
    }

    public static void selectionSort(int [] arr)
    {
        for (int i=0; i<arr.length-1; i++)
        {
            int min = i;

            for (int j=i+1; j<arr.length; j++)
            {
                if (arr[j] < arr[min])
                {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void print (int [] arr, int n)
    {
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}