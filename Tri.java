public class Tri {
    public static void main(String[] args) {
        int n = 4; 

        for (int i = 1; i <= n; i++) {
            // The trick is right here: j goes up to i, NOT a fixed number
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Just like the rectangle fix, use an empty println to change lines
            System.out.println();
        }
    }
}
    
