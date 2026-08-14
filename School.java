package com.example.myapplication.Day1Assignment;

public class School {
    boolean[] present =new boolean[10];
    String[] name=new String[10];
    static int total=0;

    void add_Student(String name)
    {
        if(total==10)
        {
            System.out.println("Class is full . Not able to take new Admission");
        }
        else
        {
            for(int i=0;i<10;i++)
            {
                if(present[i]==false)
                {
                    this.present[i]=true;
                    this.name[i]=name;
                    this.total++;
                    break;
                }
            }
        }

    }

    void display()
    {
        for(int i=0;i<10;i++)
        {
            if(present[i]==true)
            System.out.print(name[i]+" ");
        }
        System.out.println();
    }

    void search(String name)
    {
        boolean flag=false;
        for(int i=0;i<10;i++)
        {
            if(present[i]==true && this.name[i].equals(name))
            {
                System.out.println("Student is present");
                flag=true;
                break;

            }

        }
        if(flag==false)
        {
            System.out.println("Student is not present");

        }


    }

    void exit_Student(String name)
    {
        for(int i=0;i<10;i++)
        {
            if(present[i]==true && this.name[i].equals(name))
            {
                this.total--;
                this.name[i]="";
                this.present[i]=false;
                System.out.println("Student has exited");
                break;

            }

        }

    }

}
