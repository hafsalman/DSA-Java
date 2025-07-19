//Hafsa Salman
//DSA Lab 03: Task no. 03

import java.util.Scanner;

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 03: Task no. 03");
        System.out.println();

        Scanner s =  new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();

        int [] arr = new  int[size];

        System.out.println("Enter elements of the array: ");
        for (int i=0; i<size; i++)
        {
            System.out.print("Element " +  (i+1) + ": ");
            arr[i] = s.nextInt();
        }

        System.out.println("\nPrinting Original Array: ");
        print(arr, size);

        selectionSort(arr, size);

        System.out.println("\nPrinting 4 Maximum Elements: ");
        print(arr, 4);
    }

    public static void selectionSort (int [] arr, int size)
    {
        for (int i=0; i<size; i++)
        {
            int min = i;

            for (int j=i+1; j<size; j++)
            {
                if (arr[j] > arr[min])
                {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void print(int[] arr, int size)
    {
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}