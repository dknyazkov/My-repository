


import java.util.ArrayList;
import java.util.List;

public class Person {
    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getMan() {
        return isMan;
    }

    public Person() {
    }

    String login;
    String name;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMan(Boolean man) {
        isMan = man;
    }

    Integer age;
    Boolean isMan;
    List<Child> children=new ArrayList<>();

    public Person(String login, String name, Integer age, Boolean isMan) {
        this.login = login;
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public List<Child> getChildren() {
        return children;
    }

    public Person(String login, String name, Integer age, Boolean isMan, List<Child> children) {
        this.login = login;
        this.name = name;
        this.age = age;
        this.isMan = isMan;
        this.children = children;
    }

    @Override
    public String toString() {
        return "Person{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMan=" + isMan +
                ", children=" + children +
                '}';
    }
}

