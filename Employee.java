package com.example.myapplication.Day1Assignment;

 class Employee {
    int id;
    String name;
    double sallary;

    Employee(int id,String name,double sallary)
    {
        this.id=id;
        this.sallary=sallary;
        this.name=name;
    }

    void display()
    {
        System.out.println("id is "+this.id);
        System.out.println("name is "+this.name);
        System.out.println("sallary is "+this.sallary);

    }
}
