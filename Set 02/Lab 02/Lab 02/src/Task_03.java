//Hafsa Salman
//DSA Lab 02: Task no. 03

public class Task_03
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("DSA Lab 02: Task no. 03");
        System.out.println();

        String [] name = {"Ali", "Ahmed", "Naseer", "Sameer", "Salman"};

        double [][] jagged = { {3.21, 2.45, 4.0, 3.0, 3.75},
                               {3.75, 2.0, 2.15},
                               {3.45, 3.0},
                               {4.0, 3.0},
                               {3.33, 2.75, 3.35, 3.98}};


        double [] gpa = new double[jagged.length];

        for (int i=0; i< jagged.length; i++)
        {
            int total = jagged[i].length;
            double sum = 0;

            for (int j=0; j<jagged[i].length; j++)
            {
                sum += jagged[i][j];
            }

            gpa[i] = sum/total;
        }

        System.out.println("Printing GPAs");
        for(int i=0; i<gpa.length; i++)
        {
            System.out.println(name[i] + ": " + gpa[i]);
        }
    }
}