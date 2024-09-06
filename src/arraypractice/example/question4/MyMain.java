package arraypractice.example.question4;
// Find Maximum Element:
public class MyMain {
    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 19, 7, 26, 14};
        int max = arr[0];
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        System.out.println("Max element :  "+max);
    }
}

// Max element :  26