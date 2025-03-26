package Operators;
import java.util.Scanner;
public class Relational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number you want to check:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a is greater than b:" + (a > b));
        System.out.println("a is less than b:" + (a < b));
        System.out.println("a is greater than or equals to b:" + (a >= b));
        System.out.println("a is less than or equals to b:" + (a <= b));
        System.out.println("a is equals to b:" + (a == b));
        System.out.println("a is not equals to b:" + (a != b));
    }
}
