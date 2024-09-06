package arraypractice.example.question2;
// Sum of Array Elements:
public class MyMain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int val:arr){
            sum+=val;
        }
        System.out.println("Sum : "+sum);
    }
}

//Sum : 55