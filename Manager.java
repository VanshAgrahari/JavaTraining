package com.example.myapplication.Day1Assignment;

class Manager extends Employee{
     String dept;
     Manager(int id,String name,double sallary,String dept)
     {
         super(id,name,sallary);
         this.dept=dept;
     }


     void display()
     {
         super.display();
         System.out.println(this.dept);


     }
}
