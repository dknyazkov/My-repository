import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        List<Child> children1 = Arrays.asList(new Child("child7", "Damon", 7, true),
                new Child("child6", "Johnny", 15, true));
        List<Child> children2 = Arrays.asList(new Child("child5", "Margaret", 10, false),
                new Child("child4", "Nick", 2, true));
        List<Child> children3 = Arrays.asList(new Child("child3", "Arnold", 7, true),
                new Child("child2", "Rebecca", 4, false), new Child("child1", "Mike", 11, true));
        Person person1 = new Person("Login1", "Steve", 18, true, children1);
        Person person2 = new Person("Login2", "Sara", 32, false, children2);
        Person person3 = new Person("Login3", "Bob", 44, true, children3);

        ArrayList<Person> parents = new ArrayList<>();
        parents.add(person1);
        parents.add(person2);
        parents.add(person3);
        person.children.addAll(children1);
        person.children.addAll(children2);
        person.children.addAll(children3);

        //Таск 1
        Stream<Person> stream = onlyMan(parents);
        stream.forEach(System.out::println);

        //Таск 2
        parents.stream()
                .filter(child -> child.getChildren().size() > 2)
                .peek(System.out::println)
                .collect(Collectors.toList());

        //Таск 3
        person.children.stream()
                .filter(age -> age.getAge() < 6)
                .map(Person::getName)
                .peek(System.out::println)
                .collect(Collectors.toList());

        //Таск 4
        parents.stream()
                .filter(isMan -> isMan.getMan() == false)
                .filter(woman -> isChildren(woman))
                .peek(System.out::println)
                .collect(Collectors.toList());


        //Таск 5
        person.children.stream()
                .map(age -> age.getAge())
                .distinct()
                .peek(System.out::println)
                .collect(Collectors.toList());


    }

    public static Stream<Person> onlyMan(ArrayList<Person> parents) {
        return parents.stream()
                .filter(Person::getMan);
    }

    public static boolean isChildren(Person person) {
        for (Person child : person.getChildren()
        ) {
            if (child.getAge() < 12)
                return true;
        }
        return false;
    }

}
