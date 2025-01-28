import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping:");
        System.out.printf("a = %d and b = %d",a,b);
        int c = a;
        a=b; 
        b=c;
        System.out.println("\nAfter Swapping:");
        System.out.printf("a = %d and b = %d",a,b);
    }
}

