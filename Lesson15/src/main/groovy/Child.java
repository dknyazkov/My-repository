import java.util.List;

public class Child extends Person{
    public Child(String login, String name, Integer age, Boolean isMan) {
        super(login, name, age, isMan);
    }

    public Child() {
    }

    @Override
    public String toString() {
        return "Child{\n" +
                "login='" + login + "\n" +
                ", name='" + name + "\n" +
                ", age=" + age + "\n" +
                ", isMan=" + isMan + "\n" +
                '}';
    }
}

