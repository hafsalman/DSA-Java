//Hafsa Salman
//DSA Lab 03: Task no. 08

public class Task_08
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 03: Task no. 08");
        System.out.println();

        int[] arr = {37, 12, 89, 5, 64, 27, 93, 48, 10, 76, 58, 41, 30, 7, 85, 66, 91, 22, 73, 50, 3, 99, 18, 62, 11, 29, 55, 8, 43, 36, 24, 70, 15, 95, 80, 1, 67, 20, 13, 100, 38, 31, 86, 16, 6, 60, 47, 14, 25, 79};

        System.out.println("Printing Original Array: ");
        print(arr);

        bubbleSort(arr);

        System.out.println("\n\nPrinting Sorted Array: ");
        print(arr);
    }

    public static void bubbleSort(int[] arr)
    {
        for (int i=0; i<arr.length-1; i++)
        {
            for (int j=0; j<arr.length-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void print (int [] arr)
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

//Create an array of 50 random integers, and apply the bubble sort algorithm.