//Hafsa Salman
//DSA Lab 01: Task no. 05

public class Task_05
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 01: Task no. 05");
        System.out.println();

        int size = 4;

        int [] arr = new int[5];

        arr[0] = 10;
        arr[1] = 11;
        arr[2] = 14;
        arr[3] = 16;

        System.out.println("Printing Original Array: ");
        print(size, arr);

        int sum = 0;

        for (int i=0; i<size; i++)
        {
            sum += arr[i];
        }

        size = 5;

        arr[4] = sum;

        System.out.println("\n\nPrinting Array after addition: ");
        print(size, arr);

        size -= 2;

        System.out.println("\n\nPrinting Array after removing last 2 elements: ");
        print(size, arr);
    }

    public static void print (int size, int [] arr)
    {
        for (int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}