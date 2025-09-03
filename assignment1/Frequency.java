import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) freq.put(num, freq.getOrDefault(num, 0) + 1);

        System.out.println("Frequencies:");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet())
            System.out.println(entry.getKey() + " → " + entry.getValue());

        sc.close();
    }
}