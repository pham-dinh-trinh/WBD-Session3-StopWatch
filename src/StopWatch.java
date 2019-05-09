import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        int choise;
        do {
            System.out.println("Enter choose number:");
            System.out.println("1.Start");
            System.out.println("2.Stop");
            System.out.println("3.Elapse");
            System.out.println("0.Exit");
            choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("Start time:");
                    System.out.println(stopWatch.startTime());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Stop time:");
                    System.out.println(stopWatch.stopTime());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Elapse time:");
                    System.out.println(stopWatch.getElapseTime());
                    System.exit(0);
                    break;
            }
        } while (choise != 0);
    }

    private StopWatch() {

    }

    private double startTime() {
        double startTime = System.currentTimeMillis();
        return startTime;
    }

    private double stopTime() {
        double stopTime = System.currentTimeMillis();
        return stopTime;
    }

    private double getElapseTime() {
        double result = this.stopTime() - this.startTime();
        return result;
    }

}
