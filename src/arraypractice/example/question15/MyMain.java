package arraypractice.example.question15;
// Sum of Odd Elements:
public class MyMain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int sum = 0;
        for(int val:arr){
            if(val%2!=0){
                sum+=val;
            }
        }
        System.out.println("Sum of Odd number : "+sum);
    }
}

// Sum of Odd number : 16