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


public class Index {
    public static void main(String[] args) {
    //    A data = new A();
    //    B data1 = new B();
    //    data.setPriority(1);
    //    data1.setPriority(6);
        //System.out.println(data.getPriority());
    //    System.out.println(data1.getPriority());
    //    data.start();
    //    data1.start();


    //lambda function
    Runnable data = () -> {
          for(int i = 0; i < 10; i++) {
              System.out.println("Hi");
              try {
                  Thread.sleep(10);
              } catch (InterruptedException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
              }
        }
     };
     Runnable data1 = () -> {
        for(int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
      }
   };

       Thread t1 = new Thread(data);
       Thread t2 = new Thread(data1);

       t1.start();
       t2.start();


    }
}
