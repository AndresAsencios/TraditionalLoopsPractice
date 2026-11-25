package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("John", "Smith",25));
        people.add(new Person("Sarah", "Johnson", 32));
        people.add(new Person("Michael", "Brown", 16));
        people.add(new Person("Robert", "Davis", 72));

        // Exercise 1: Display people older than 30
        System.out.println("Exercise 1:");

        people.stream()
                .filter(person -> person.getAge() > 30)
                .forEach(person -> System.out.println(person.getFirstName()));

        // Exercise 2: Display people between 20 and 30
        System.out.println("Exercise 2:");

        people.stream()
                .filter(person -> person.getAge() > 20 && person.getAge() < 30)
                .forEach(person -> System.out.println(person.getFirstName()));

        // Exercise 3: Display people using OR 18 OR older than 65

        System.out.println("Exercise 3:");

        people.stream()
                .filter(person -> person.getAge() < 18 || person.getAge() > 65)
                .forEach(person -> System.out.println(person.getFirstName()));

        // Exercise 4: Filter by first name

        System.out.println("Exercise 4:");

        people.stream()
                .filter(person -> person.getFirstName().startsWith("J"))
                .forEach(person -> System.out.println(person.getFirstName()));

        // Exercise 5: Map person objects to first name

        System.out.println("Exercise 5:");

        people.stream()
                .map(person -> person.getFirstName())
                .forEach(name -> System.out.println(name));

        //

        }
    }
