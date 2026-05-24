import java.utill.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print(s: "Enter your name: ");
        String name = scn.nextLine();
        System.out.println("Hello," + name);
        scn.close();
    }
}