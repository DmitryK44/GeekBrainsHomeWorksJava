package ru.geekbrains.lesson5;

public class Employee {
    private static final int CURRENT_YEAR = 2022;

    private String surname;
    private String secondName;
    private String name;
    private String post;
    private String mail;
    private int phone;
    private int salary;
    private int birthday;

    public Employee(String surname,
                    String name,
                    String secondName,
                    String post,
                    String mail,
                    int phone,
                    int salary,
                    int birthday) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.post = post;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.birthday = birthday;
    }

    int Age() {
        return CURRENT_YEAR - birthday;
    }

    String infoaboutemployees() {
        return this.surname + " " +
                this.name + " " +
                this.secondName + ", " +
                ", Post is : " + this.post +
                ", Mail : " + this.mail +
                ", Phone : " + this.phone +
                ", Salary is " + this.salary + " USD " +
                ", " + this.Age() + " years old ";
    }

}
