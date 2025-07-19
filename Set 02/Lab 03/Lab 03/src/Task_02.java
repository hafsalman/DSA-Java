//Hafsa Salman
//DSA Lab 03: Task no. 02

public class Task_02
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 03: Task no. 02");
        System.out.println();

        int [] arr = {20, 12, 15, 2, 10, 1, 13, 9, 5};

        System.out.println("Printing Original Array: ");
        print(arr);

        int n = arr.length;
        int max = arr[0];
        int maxIndex = 0;

        for (int i=1; i<n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                maxIndex = i;
            }
        }

        for (int i=maxIndex; i<n-1; i++)
        {
            arr[i] = arr[i + 1];
        }

        int[] temp = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
        {
            temp[i] = arr[i];
        }
        insertionSort(temp);

        for (int i=n-2; i>=4; i--)
        {
            arr[i + 1] = temp[i];
        }

        arr[4] = max;

        for (int i=0; i<4; i++)
        {
            arr[i] = temp[i];
        }

        System.out.println("\nPrinting Required Array: ");
        print(arr);
    }

    public static void print (int [] arr)
    {
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}