import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ii = sc.nextInt();
        Thread countdown = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= ii; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        System.out.println("Error");
                    }
                }
                System.out.println("Done");
            }
        });
        countdown.start();
    }
}
