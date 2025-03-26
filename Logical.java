package Operators;

public class Logical {
    public static void main(String[] args) {
        System.out.println("check for logical operator");
        // checking for AND
        System.out.println((10 > 5) && (9 > 6)); // both the conditions should be true then only it will print the result true
        System.out.println((10 > 5) && (9 < 6));
        System.out.println((10 < 5) && (9 < 6));
        // checking for OR
        System.out.println((10 > 5) || (9 < 6)); // one condition should be true then only it will print the result true
        System.out.println((10 > 5) || (9 > 6));
        System.out.println((10 < 5) || (9 < 6));
        // checking for NOT
        System.out.println(!(10 > 5)); // if we use NOT condition like in the example practically the result would be true but if we are using ! operator then it reverse the result as false
        System.out.println(!(10 < 5)); // main output false
                                       // print true 
    }
}
