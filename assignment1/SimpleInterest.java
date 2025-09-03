import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextInt();
        double rate = sc.nextInt();
        double time = sc.nextInt();
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
}