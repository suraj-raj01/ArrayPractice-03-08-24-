package arraypractice.example.question8;
// Copying Arrays:
public class MyMain {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }
        System.out.print("Second Array : [");
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]);
            if(i<arr2.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}

// Second Array : [1, 2, 3, 4, 5]