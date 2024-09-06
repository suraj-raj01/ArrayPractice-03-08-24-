package arraypractice.example.question6;
// Reverse an Array:
public class MyMain {
    public static void main(String[] args) {
        char[] character = {'a', 'b', 'c', 'd', 'e'};
        System.out.print("[");
        for(int i = character.length-1; i>=0; i--){
            System.out.print(character[i]);
            if(i>0){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}

// [e, d, c, b, a]