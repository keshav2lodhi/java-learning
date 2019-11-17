package multithreading;

class Base {

    int num;
    boolean valueSet = false;

    public synchronized void get() {
        while (!valueSet) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Get: " + num);
        valueSet = false;
        notify();
    }

    public synchronized void set(int num) {

        while (valueSet) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Set: " + num);
        this.num = num;
        valueSet = true;
        notify();
    }
}

class Producer implements Runnable {

    Base base;

    public Producer(Base base) {
        this.base = base;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            base.set(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Consumer implements Runnable {
    Base base;

    public Consumer(Base base) {
        this.base = base;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {
        while (true) {
            base.get();
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
        }
    }
}

class InterThread {
    public static void main(String[] args) {
        Base base = new Base();
        new Producer(base);
        new Consumer(base);
    }
}
