package threads;

class A extends Thread{

    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Hi");
        }
    }
 
}

class B extends Thread{

    public void show() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
 
}

public class Index {
    public static void main(String[] args) {
       A data = new A();
       B data1 = new B();

       data.run();
       data1.show();
    }
}
