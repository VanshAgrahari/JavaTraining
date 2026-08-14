package com.example.myapplication.Day1Assignment;

import java.util.Scanner;

public class Calculator {
    void add(double a,double b)
    {
        System.out.println(a+b);

    }

    void sub(double a,double b)
    {
        System.out.println(a-b);

    }
    void mul(double a,double b)
    {
        System.out.println(a*b);

    }

    void div(double a,double b)
    {
        System.out.println(a/b);

    }

    public static void main(String[] args)
    {
        Calculator calc=new Calculator();

        do{
            System.out.println("Please press 1  for addition \n 2 for subtraction \n 3 for multiplication \n 4 for division \n 5 key for exit");

            Scanner sc=new Scanner(System.in);
            int val=sc.nextInt();
            if(val==5)
            {
                break;
            }
            System.out.println("Enter first number");
            double first=sc.nextDouble();
            System.out.println("Enter second number");
            double second=sc.nextDouble();

            switch (val)
            {
                case 1:
                {
                    calc.add(first,second);
                    break;

                }
                case 2:
                {
                    calc.sub(first,second);
                    break;

                }
                case 3:
                {
                    calc.mul(first,second);
                    break;

                }
                case 4:
                {
                    calc.div(first,second);
                    break;

                }

            }

        }while(true);


    }
}
