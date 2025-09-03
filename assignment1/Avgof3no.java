import java.util.Scanner;

public class Avgof3no {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        double num1 = v.nextInt();
        double num2 = v.nextInt();
        double num3 = v.nextInt();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average of the three numbers: " + average);
}
}