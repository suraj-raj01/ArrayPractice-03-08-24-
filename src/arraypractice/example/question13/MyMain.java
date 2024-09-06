package arraypractice.example.question13;
// Array of Floating-point Numbers:
public class MyMain {
    public static void main(String[] args) {
        float[] arr= {1.1f, 2.2f, 3.3f, 4.4f};
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}

// [1.1, 2.2, 3.3, 4.4]