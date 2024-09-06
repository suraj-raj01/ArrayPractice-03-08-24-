package arraypractice.example.question17;
// Find the Smallest Positive Number:
public class MyMain {
    public static void main(String[] args) {
        int[] arr = {12, -5, 0, 8, 3};
        int smallestPositive = arr[0];
        for (int j : arr) {
            if (smallestPositive > j && j > 0) {
                smallestPositive = j;
            }
        }
        System.out.println("Smallest Positive : "+smallestPositive);
    }
}

// Smallest Positive : 3