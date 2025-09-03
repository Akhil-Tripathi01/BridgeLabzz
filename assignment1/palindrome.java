import java.util.*;

class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        boolean p = true;
        for (int i = 0; i < n/2; i++)
            if (a[i] != a[n-1-i]) { p = false; break; }

        System.out.println(p ? "Palindrome" : "Not Palindrome");
    }
}