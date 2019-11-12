package com.example.snpgm12employeeinformationapp;


public class Employee
{
    String firstName = "First Name";
    String lastName = "Last Name";
    String age = "Age";
    String height = "Height";
    String weight = "Weight";

    public Employee(String firstName, String lastName, String age, String height, String weight)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public String employeeGreeting()
    {
        return("Hello " + firstName + " " + lastName + ", you are " + age + " years old, " + height + " feet tall, and " + weight + " pounds.");
    }

}
