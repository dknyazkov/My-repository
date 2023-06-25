package src.main.groovy.org.example;


public class Main {
    public static void main(String[] args) {
        Phone iphone=new Phone();
        Laptop asus=new Laptop();
        Sailable<Phone> sailablePhone=new ActionPhone();
        Sailable<Laptop> sailableLaptop=new ActionLaptop();
        sailablePhone.addProduct(iphone);
        sailableLaptop.addProduct(asus);
        sailableLaptop.orderProduct(asus);
        sailablePhone.orderProduct(iphone);
        sailableLaptop.deleteProduct(asus);
        sailablePhone.deleteProduct(iphone);
    }
}
