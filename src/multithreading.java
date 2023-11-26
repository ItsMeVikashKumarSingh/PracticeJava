// class test extends Thread {
// @Override
//     public void run() {
//         int i = 0;  
//         while(true)
//         System.out.println("Thread" + i++);
//     }
// }
// public class multithreading {
//     public static void main(String[] args) {
//         int i=0;
//         test t = new test();
//         t.start();
//         while(true){
//         System.out.println("Main" + i++);
//         }
//     }
    
// }

// class multithreading extends Thread{
//     public void run()
//     {
//         int i = 0;  
//         while(true)
//         System.out.println("Thread" + i++);
//     }
//     public static void main(String[] args) {
//         int i=0;
//         multithreading m = new multithreading();
//         m.start();
//         while(true){
//         System.out.println("Main" + i++);
//     }
// }
// }


class test implements Runnable {
    public void run() {
        int i = 0;  
        while(true)
        System.out.println("Thread" + i++);
    }
}
public class multithreading {
    public static void main(String [] args){
     int i=0;
        test t = new test();
        Thread n = new Thread(t);
        n.start();
        while(true){
        System.out.println("Main" + i++);
        }
    }
}