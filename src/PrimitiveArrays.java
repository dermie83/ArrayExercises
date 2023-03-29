import java.util.*;

public class PrimitiveArrays {

    private static Scanner input = new Scanner (System.in);

    public static void main(String[] args)
    {
        //exercise_demo();
        //exercise_one();
        //exercise_two();
        //exercise_three();
        //exercise_four();
        //exercise_five();
        exercise_six();
    }

    public static void exercise_demo()
    {
        int numbers[] = new int[6];

        for (int i = 0; i < numbers.length ; i++)
        {
            System.out.print("Enter value : ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length ; i++)
        {
            System.out.println("value " + (i+1)  + " is: " + numbers[i]);
        }
    }

    public static void exercise_one()
    {
        int reversedNumbers[] = new int[6];

        for (int i = 0; i < reversedNumbers.length ; i++)
        {
            System.out.print("Enter value : ");
            reversedNumbers[i] = input.nextInt();
        }

        for (int i = reversedNumbers.length; i > 0; i--)
        {
            System.out.println("value " + (reversedNumbers.length-i)  + " is: " + reversedNumbers[i-1]);
        }
    }

    public static void exercise_two()
    {
        int numbersPlusOne[] = new int[10];

        for (int i = 0; i < numbersPlusOne.length ; i++)
        {
            System.out.print("Enter value : ");
            numbersPlusOne[i] = input.nextInt();
        }

        for (int i = 0; i < numbersPlusOne.length ; i++)
        {
            System.out.println("value " + (i+1)  + " is: " + (1+(numbersPlusOne[i])));
        }
    }

    public static void exercise_three()
    {
        double numbersDouble[] = new double[10];

        for (int i = 0; i < numbersDouble.length ; i++)
        {
            System.out.print("Enter value : ");
            numbersDouble[i] = input.nextDouble();
        }

        for (int i = 0; i < numbersDouble.length ; i++)
        {
            System.out.println("value " + (i+1)  + " is: " + numbersDouble[i]);
        }
    }

    public static void exercise_four()
    {
        double wages[] = new double[10];

        for (int i = 0; i < wages.length ; i++)
        {
            System.out.print("Enter value : ");
            wages[i] = input.nextDouble();
        }

        for (int i = 0; i < wages.length ; i++)
            if (wages[i]> 100.0) {
                {
                    System.out.println("value " + (i + 1) + " is: " + wages[i]);
                }
            }
    }

    public static void exercise_five()
    {
        double wageReduction[] = new double[5];

        for (int i = 0; i < wageReduction.length ; i++)
        {
            System.out.print("Enter value : ");
            wageReduction[i] = input.nextDouble();
        }

        for (int i = 0; i < wageReduction.length ; i++)
            if (wageReduction[i]> 1000.0) {
                {
                    System.out.println("value " + (i + 1) + " is: " + ((wageReduction[i])-(0.1*(wageReduction[i]))));
                }
            }
    }

    public static void exercise_six()
    {
        double avgWage[] = new double[5];

        for (int i = 0; i < avgWage.length ; i++)
        {
            System.out.print("Enter value : ");
            avgWage[i] = input.nextDouble();
        }
        double total = 0.0;
        for (int i = 0; i < avgWage.length ; i++)
        {
            total = total + avgWage[i];
            System.out.println("The average wage is " + (total / avgWage.length));
        }

    }
}
