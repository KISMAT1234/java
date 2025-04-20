// class A implements Runnable{

//     public void run() {
//         for(int i = 0; i < 100; i++) {
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
 
// }

// class B implements Runnable{

//     public void run() {
//         for(int i = 0; i < 100; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
 
// }


// public class Index {
//     public static void main(String[] args) {
//     //    A data = new A();
//     //    B data1 = new B();
//     //    data.setPriority(1);
//     //    data1.setPriority(6);
//         //System.out.println(data.getPriority());
//     //    System.out.println(data1.getPriority());
//     //    data.start();
//     //    data1.start();


//     //lambda function
//     Runnable data = () -> {
//           for(int i = 0; i < 10; i++) {
//               System.out.println("Hi");
//               try {
//                   Thread.sleep(10);
//               } catch (InterruptedException e) {
//                   // TODO Auto-generated catch block
//                   e.printStackTrace();
//               }
//         }
//      };
//      Runnable data1 = () -> {
//         for(int i = 0; i < 10; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//       }
//    };

//        Thread t1 = new Thread(data);
//        Thread t2 = new Thread(data1);

//        t1.start();
//        t2.start();


//     }
// }










// Thread state

class Counter {
    int count = 2;
    public synchronized void increment(){  // In Java, the synchronized keyword is used to prevent multiple threads from accessing a method or block of code at the same time — it enforces mutual exclusion
       count++;
    }
}

public class Index {
    public static void main(String[] args) throws InterruptedException{
        Counter c = new Counter();
        // c.increment();
        // System.out.println(c.count);

        Runnable obj1 = () -> {
            for(int i = 0; i < 10; i++) {
                c.increment();
                // System.out.println(c.count);
            }
            System.out.println("inside first thread");
        };

        Runnable obj2 = () -> {
            for(int i = 0; i < 10; i++) {
                c.increment();
            }
            System.out.println("inside second thread");
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        t1.join();  //join() tells the current thread (in your case, the main thread) to Pause and wait until the thread t1 has finished executing.
        
        System.out.println(c.count);


    }
}


//Thread state
 1. New
 2. Runnable
 3. Start
 4. Running
 5. Wait
 6. Dead
