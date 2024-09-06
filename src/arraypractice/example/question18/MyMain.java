package arraypractice.example.question18;
// Product of Array Elements:
public class MyMain {
    public static void main(String[] args) {
        double[] arr = {1.5, 2.0, 3.5};
        double product = 1;
        for(double val:arr){
            product*=val;
        }
        System.out.println("Product : "+product);
    }
}

// Product : 10.5