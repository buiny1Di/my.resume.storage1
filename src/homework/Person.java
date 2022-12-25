package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
    private String name;
    private int weight;


    public Person(VariantsOfName value, int weight) {
        this.name = String.valueOf(value);
        this.weight = weight;
    }

    public static Person createNewMan() {
        Person person = new Person(VariantsOfName.values()[(int) (10 * Math.random())],
                (int) (100 * Math.random()));
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.weight != o.weight )
            return this.weight - o.weight;
        else
            return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Person.createNewMan());
        }
        Collections.sort(list);
        System.out.println(list);

    }
}
