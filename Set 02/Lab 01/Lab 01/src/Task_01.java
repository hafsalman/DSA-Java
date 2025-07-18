//Hafsa Salman
//DSA Lab 01: Task no. 01

public class Task_01
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 01: Task no. 01");
        System.out.println();

        if (args.length == 0)
        {
            System.out.println("No output!");
        }

        else
        {
            for (int i=0; i<args.length; i++)
            {
                System.out.println("Argument " + (i+1) + ": " + args[i]);
            }
        }
    }
}