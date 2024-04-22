package org.okten.javacore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

    public static void main(String[] args) {
        Person person1 = new Person("Mike", 25, List.of("pen", "pencil"));
        Person person2 = new Person("John", 31, List.of("гаманець", "сорочка"));
        Person person3 = new Person("Winston", 45, List.of("рюкзак", "ноутбук"));
        Person person4 = new Person("Terry", 13, List.of("телефон", "зарядний пристрій"));
        Person person5 = new Person("Tom", 6, List.of("pen", "сорочка"));

        List<Person> people = List.of(person1, person2, person3, person4, person5);
//        List<Person> people = new ArrayList<>();

        // Classical approach
        List<Person> peopleWithAgeGreaterThat30 = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() > 30) {
                peopleWithAgeGreaterThat30.add(person);
            }
        }
        System.out.println(peopleWithAgeGreaterThat30);

        // StreamAPI approach
        List<Person> people2 = people.stream()
                .filter(person -> person.getAge() > 30)
                .collect(Collectors.toList()); // or just .toList() since Java 16
        System.out.println("StreamAPI approach: " + people2);

        // Classical approach
        int maxAge = 0;
        Person personWithMaxAge = null;
        for (Person person : people) {
            if (maxAge < person.getAge()) {
                maxAge = person.getAge();
                personWithMaxAge = person;
            }
        }
        System.out.println("Classical approach: " + personWithMaxAge);

        // StreamAPI approach
        people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .ifPresent(person -> System.out.println("Stream API approach: " + person));

        // Classical approach
        List<Integer> ages = new ArrayList<>();
        for (Person person : people) {
            ages.add(person.getAge());
        }
        System.out.println(ages);

        // StreamAPI approach
        System.out.println(people.stream()
                .map(Person::getAge)
                .toList());


        System.out.println(people.stream()
                .flatMap(person -> person.getStuff().stream())
                .distinct()
                .toList());
        System.out.println(people.stream()
                .map(Person::getStuff)
                .flatMap(Collection::stream)
                .distinct()
                .toList());
    }
}
