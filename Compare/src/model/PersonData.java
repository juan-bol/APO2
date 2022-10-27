package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonData {

    public ArrayList<Person> people;

    public PersonData(){
        people = new ArrayList<Person>();

        Person p1 = new Person("Luis", 50, "medellin");
        Person p2 = new Person("Luis", 50, "cali");
        Person p3 = new Person("Luis", 20, "bogota");
        Person p4 = new Person("Daniel", 15, "medellin");

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

    }

    public void sort(){
        Collections.sort(people);
    }

    public void sortByName(){
        Collections.sort(people, Comparator.comparing(Person::getNombre)
        );
    }

    public void sortByCity(){
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getCiudad().compareTo(o2.getCiudad());
            }
        });
    }

    public void sortByAge(){
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getEdad()-o2.getEdad();
            }
        });
    }

    public void print(){
        for (Person p: people) {
            System.out.println(p.getNombre()+ " "+p.getEdad()+ " " +p.getCiudad());
        }
    }
}
