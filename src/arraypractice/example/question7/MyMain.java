package arraypractice.example.question7;
// Element Search in Array:
public class MyMain {
    public static void main(String[] args) {
        int[] arr = {4, 8, 15, 16, 23, 42};
        int search = 15;
        for(int i=0; i<arr.length; i++){
            if(search==arr[i]){
                System.out.println("Element "+arr[i]+" found at index "+i);
            }
        }
    }
}

// Element 15 found at index 2