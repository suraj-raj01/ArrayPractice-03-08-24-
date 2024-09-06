package arraypractice.example.question16;
// Replace Elements in an Array:
public class MyMain {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 7};
        // replace 4 with 9
        int replace = 4;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==4){
                arr[i] = 9;
            }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}

// 9 5 6 9 7