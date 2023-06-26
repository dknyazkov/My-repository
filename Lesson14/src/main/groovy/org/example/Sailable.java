package src.main.groovy.org.example;


public interface Sailable <T>{

    void addProduct(T product);
    void orderProduct(T product);
    void deleteProduct(T product);
}
