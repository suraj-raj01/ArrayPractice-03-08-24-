package arraypractice.example.question10;
// Count Occurrences of an Element:
public class MyMain {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'a', 'c', 'a', 'd'};
        int t = 0;
        char temp = '0';
        for (char value : arr) {
            int c = 0;
            for (char item : arr) {
                if (value == item) {
                    c++;
                }
            }
            if (t < c) {
                t = c;
                temp = value;
            }
        }
        System.out.println("'"+temp+ "' occurs "+t+" times");
    }
}

// 'a' occurs 3 times