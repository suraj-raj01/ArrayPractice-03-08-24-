package arraypractice.example.question11;
// Find Second Largest Element:
public class MyMain {
    public static void main(String[] args) {
        int[] arr = {15, 22, 8, 19, 31};
        int secondLargest = arr[0];
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Second Largest Element : ");
        System.out.println(arr[1]);
    }
}

// Second Largest Element : 22