package com.example.myapplication.Day1Assignment;
class Student {

    String name;
    int rollno;
    int sub1,sub2,sub3,sub4,sub5;

    Student(String name,int rollno)
    {
        this.name=name;
        this.rollno=rollno;
    }
    void calculation(int a,int b,int c,int d,int e)
    {
        this.sub1=a;
        this.sub2=b;
        this.sub3=c;
        this.sub4=d;
        this.sub5=e;

        //total
        int total=sub1+sub2+sub3+sub4+sub5;
        System.out.println("total marks are" +total);

        // percent
        float percent=(total*100)/(500.0f);
        System.out.println("percentage obtained is" +percent);

        //grade
        if(percent>=90)
        {
            System.out.println("Grade obtained is A" );
        }
        else if(percent>=80)
        {
            System.out.println("Grade obtained is B" );
        }
        else if(percent>=70)
        {
            System.out.println("Grade obtained is C" );
        }
        else if(percent>=60)
        {
            System.out.println("Grade obtained is D" );
        }
        else if(percent>=50)
        {
            System.out.println("Grade obtained is E" );
        }
        else
        {
            System.out.println("Grade obtained is F" );

        }

    }

}

