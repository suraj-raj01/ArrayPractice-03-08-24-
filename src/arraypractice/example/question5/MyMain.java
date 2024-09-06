package arraypractice.example.question5;
// Find Minimum Element:
public class MyMain {
    public static void main(String[] args) {
        double[] arr = {2.5, 3.8, 1.9, 5.6, 4.3};
        double min = arr[0];
        for(double val:arr){
            if(min>val){
                min = val;
            }
        }
        System.out.println("Minimum value : "+min);
    }
}

// Minimum value : 1.9