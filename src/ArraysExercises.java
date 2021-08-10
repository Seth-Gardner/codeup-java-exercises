import java.lang.reflect.Array;

import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] arr, Person obj){
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = obj;
        return arr;
    };

    public static void main(String[] args) {
        Person john = new Person("John");
        Person freddie = new Person("Freddie");
        Person jack = new Person("Jack");
        Person ry = new Person("Ry");
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
        Person[] people = {john, freddie, jack};

        System.out.println(people[0].getName() + people[1].getName() + people[2].getName());

        people = addPerson(people, ry);
        System.out.println(people[0].getName() + people[1].getName() + people[2].getName() + people[3].getName());
    }
}
