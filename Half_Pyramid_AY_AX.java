// print the pattern (half pyramid) 

package DSA.pattern;

public class half_pyramid {

    public static void main(String[] args) {
        int n=7;
        // int m=7;

        //outer loop
        for (int i=1; i<=n; i++) {

            //inner loop
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
    
}
