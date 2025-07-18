//Hafsa Salman
//DSA Lab 03: Task no. 02

import java.util.Scanner;

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 03: Task no. 02");
        System.out.println();

        Scanner s = new Scanner(System.in);

        int [] marks = new int[10];

        System.out.println("Enter marks for 10 students: ");
        for (int i=0; i<10; i++)
        {
            System.out.print("Student " + (i+1) + ": ");
            marks[i] = s.nextInt();
        }

        System.out.println("\nOriginal Marks for 10 students: ");
        print(marks);

        SelectionSort(marks);

        System.out.println("\nSorted Marks for 10 students: ");
        print(marks);
    }

    public static void SelectionSort (int [] marks)
    {
        for (int i=0; i<10; i++)
        {
            int min = i;

            for (int j=i+1; j<10; j++)
            {
                if (marks[min] > marks[j])
                {
                    min = j;
                }
            }

            int temp =  marks[min];
            marks[min] = marks[i];
            marks[i] = temp;
        }
    }

    public static void print(int [] marks)
    {
        for (int i=0; i<10; i++)
        {
            System.out.print(marks[i] + " ");
        }
    }
}