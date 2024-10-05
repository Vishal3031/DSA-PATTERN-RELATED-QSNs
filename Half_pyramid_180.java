public class Half_pyramid_180 {
    
    public static void main(String[] args) {
        int a=7; 

        //outer loop
        for (int i=1; i<=a; i++) {

            //inner loop (use for space)
            for (int j=1; j<=a-i; j++) {
                System.out.print(" ");
            }

            //inner loop (use for star)
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
