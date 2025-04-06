import java.util.* ;

public class convertToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int[] bin = new int[n] ;
        for(int i=0 ; i<n ; i++) {
            bin[i] = sc.nextInt() ;
        }

        int num = 0 ;
        int p2 = 1 ;

        for(int i=n-1 ; i<0 ; i--) {
            if(bin[i] == 1) num += p2 ;

            p2 = p2*2 ;
        }
        System.out.println(num);

    }
}
