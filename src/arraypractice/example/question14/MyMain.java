package arraypractice.example.question14;
// Check for Duplicates:
public class MyMain {
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 2, 3, 8};
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[i]==arr[j+1]){
                    count++;
                }
            }
        }
        if(count>2){
            System.out.println("yes");
        }
        System.out.println(count);
    }
}
