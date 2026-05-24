public class InvertedTri {
    public static void main(String[] args) {
        int n = 4;

        // Outer loop counts up: 1, 2, 3, 4
        for (int i = 1; i <= n; i++) {
            // Row 1 prints: 4 - 1 + 1 = 4 stars
            // Row 2 prints: 4 - 2 + 1 = 3 stars...
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}