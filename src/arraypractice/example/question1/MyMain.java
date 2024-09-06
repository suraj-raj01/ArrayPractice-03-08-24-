package arraypractice.example.question1;
// Integer Array Initialization:
public class MyMain {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
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

// [10, 20, 30, 40, 50]