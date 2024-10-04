class Half_pyramid {
        public static void main(String[] args) {
            int num=7;

            //outer loop
            for (int i=1; i<=num; i++) {
                //inner loop
                for (int j=1; j<=i; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
}