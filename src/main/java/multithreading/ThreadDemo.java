package multithreading;

/******************* Example using Thread *********************/
/*class Hi extends Thread {
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Hi");
            try {Thread.sleep(500);} catch(Exception e){}
        }
    }
}

class Hello extends Thread {
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println("Hello");
            try {Thread.sleep(500);} catch(Exception e){}
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        try {Thread.sleep(10);} catch(Exception e){}
        obj2.start();
    }
}*/

/****************** Example using Runnable ******************/
/*class Hi implements Runnable {
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Hi");
            try {Thread.sleep(500);} catch(Exception e){}
        }
    }
}

class Hello implements Runnable {
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println("Hello");
            try {Thread.sleep(500);} catch(Exception e){}
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        //Hi obj1 = new Hi();
        Runnable obj1 = new Hi();
        //Hello obj2 = new Hello();
        Runnable obj2 = new Hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {Thread.sleep(10);} catch(Exception e){}
        t2.start();
    }
}*/

/*********** Example using Anonymous Class and Lambda Expression ***********/
/*public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 5; i++){
                System.out.println("Hi");
                try {Thread.sleep(500);} catch(Exception e){}
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 5; i++){
                System.out.println("Hello");
                try {Thread.sleep(500);} catch(Exception e){}
            }
        });

        t1.start();
        try {Thread.sleep(10);} catch(Exception e){}
        t2.start();
    }
}*/

/************** Example using join and isAlive methods *************/
/*public class ThreadDemo {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 5; i++){
                System.out.println("Hi");
                try {Thread.sleep(500);} catch(Exception e){}
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 5; i++){
                System.out.println("Hello");
                try {Thread.sleep(500);} catch(Exception e){}
            }
        });

        t1.start();
        Thread.sleep(10);
        t2.start();

        System.out.println("Before join method:--> " + t1.isAlive());
        t1.join();
        t2.join();
        System.out.println("After join method:--> " + t1.isAlive());
        System.out.println("Bye");
    }
}*/

/************* Example to set thread name and priority ***********/
public class ThreadDemo {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }, "Hi Thread");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }, "Hello Thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        Thread.sleep(10);
        t2.start();

        System.out.println("Before join method:--> " + t1.isAlive());
        t1.join();
        t2.join();
        System.out.println("After join method:--> " + t1.isAlive());
        System.out.println("Bye");
    }
}
