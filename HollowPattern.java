public class HollowPattern {
    public static void main(String[] args) {
        int n = 5;
        int m = 8;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // Print a star ONLY if it's the first/last row, or first/last column
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print a space for the hollow inside
                }
            }
            System.out.println();
        }
    }
}