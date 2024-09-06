package arraypractice.example.question3;
//Average of Array Elements:
public class MyMain {
    public static void main(String[] args) {
        float[] arr = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f};
        float average = 0;
        float sum = 0;
        for(float val:arr){
            sum+=val;
        }
        average = sum/arr.length;
        System.out.printf("%f",average);
    }
}

// 4.500000