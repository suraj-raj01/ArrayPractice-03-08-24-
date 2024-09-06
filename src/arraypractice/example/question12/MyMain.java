package arraypractice.example.question12;
// Shift Array Elements:
public class MyMain {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr1.length];
        int size = arr1.length;
        int steps = 1;
        for(int i=0; i<arr2.length; i++){
            arr2[(steps+i)%size] = arr1[i];
        }
        for(int val:arr2){
            System.out.print(val+" ");
        }
    }
}

// 50 10 20 30 40