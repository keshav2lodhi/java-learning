package multithreading;

import java.util.Arrays;

public class MyThread extends Thread {
    int arr[] = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }

    public void run() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
