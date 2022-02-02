package ru.geekbrains.lesson5;

public class HomeWorkApps {
    public static void main(String[] args) {

        Employee mainEmployee = new Employee("Cat", "Dmitriy",
                "Vladimirovich", "QA",
                "qa@test.com", 88005553, 1232, 1988);

        Employee[] nasa = {
                mainEmployee,
                new Employee("Litvin", "Ivan",
                        "Ivanovich", "QA",
                        "ivan@ivan.com", 88005553, 1554 , 1954),
                new Employee("Mops", "Anton",
                        "Antonov", "QA",
                        "devops", 88005553, 1887 ,1976),
                new Employee("Siba", "Anna",
                        "Annovna", "Teamlead",
                        "anna@neanna.com", 88005553, 2131, 1991),
                new Employee("Hasky", "Baltika",
                        "Ohotovna", "CEO",
                        "goaway@mail.com", 88005553, 3311 , 1945)
        };

        oldemployees(nasa, 40);

    }

    private static void oldemployees(Employee[] nasa, int year) {
        System.out.println("------------------------------------------------------------------------");
        for (int i = 0; i < nasa.length; i++)
            if (nasa[i].Age() > year) {
                System.out.println(nasa[i].infoaboutemployees());
            }
        System.out.println("------------------------------------------------------------------------");
    }
}
