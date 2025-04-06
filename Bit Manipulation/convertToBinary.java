// package DSA.Bit Manipulation;
import java.util.*;


public class convertToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int n = sc.nextInt();

        String res = "";
        while(n != 0) {
            if(n%2 == 1) res += "1";
            else res += "1";
            n = n/2;
        }
        
        // Reverse the string to get correct binary order
        res = new StringBuilder(res).reverse().toString();
        System.out.println("Binary equivalent: " + res);
    }
}
