package main;

import model.PersonData;

public class Main {

    public static void main(String[] args) {
        PersonData data = new PersonData();
        System.out.println("sort by name");
        data.sortByName();
        data.print();
        System.out.println("sort by age");
        data.sortByAge();
        data.print();
        System.out.println("sort by city");
        data.sortByCity();
        data.print();
    }
}
