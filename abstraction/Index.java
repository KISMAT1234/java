abstract class Animal {
    public abstract void sayHello();

    public void sleep(){
        System.out.println("sleeping");
    }
}

class Dog extends Animal {
    public void sayHello(){
        System.out.println("Woof...");
    }
}

class Cat extends Dog {
    public void sayHello(){
        System.out.println("Meow...");
    }
}

class Tiger extends Animal {
    public void eat(){
        
    }
}

public class Index {
    public static void main(String[] args) {
        System.out.println("Hello World");

       Dog data = new Dog();
       data.sayHello();
       data.sleep();
    }
}
