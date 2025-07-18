//Hafsa Salman
//DSA Lab 01: Task no. 04

import java.util.Scanner;

public class Task_04
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 01: Task no. 04");
        System.out.println();

        Scanner s =  new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = s.nextInt();

        int [][] jagged = new  int [rows][];

        for (int i=0; i<rows; i++)
        {
            System.out.print("Enter columns: ");
            int columns = s.nextInt();

            jagged[i] = new int[columns];

            for (int j=0; j<columns; j++)
            {
                System.out.print("Element " + (i+1) + " x " + (j+1) + ": ");
                jagged[i][j] = s.nextInt();
            }
        }

        System.out.println("Printing Jagged Array: ");
        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<jagged[i].length; j++)
            {
                System.out.print(jagged[i][j] + " ");
            }

            System.out.println();
        }

        int [] arr = new int[rows];

        for (int i=0; i<rows; i++)
        {
            arr[i] = 0;

            for(int j=0; j<jagged[i].length; j++)
            {
                arr[i] += jagged[i][j];
            }
        }

        System.out.println("Printing Summed Array: ");
        for (int i=0; i<rows; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}