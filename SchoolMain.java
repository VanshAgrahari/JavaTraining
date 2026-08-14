package com.example.myapplication.Day1Assignment;
import java.util.Scanner;
public class SchoolMain {
    public static void main(String[] args)
    {
        School s=new School();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 1 if you want to add student to school \n Enter 2 if you want to display student of school\n  Enter 3 if you want to search any student \n Enter 4 if you want to exit any student \n enter other key to exit");

            int opn=sc.nextInt();
            sc.nextLine();
            if(opn==1)
            {
                System.out.println("Enter the name");
                String name=sc.nextLine();
                s.add_Student(name);
            }
            else if(opn==2)
            {
                s.display();

            }
            else if(opn==3)
            {
                System.out.println("Enter the name");
                String name=sc.nextLine();
                s.search(name);
            }
            else if(opn==4)
            {
                System.out.println("Enter the name");
                String name=sc.nextLine();
                s.exit_Student(name);

            }
            else
            {
                break;

            }

        }
    }
}
