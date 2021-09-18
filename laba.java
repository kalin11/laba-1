public class laba {
    public static void main(String[] args) {
        long[] a = new long[15];
        int i, n = 3, j;
        for (i = 0; i <= 14; i++) {
            a[i] = n;
            n++;
            System.out.print(a[i] + " ");
        }

        System.out.println();

        float[] x = new float[16];
        float b;
        for (i = 0; i <= 15; i++) {
            b = (float) (Math.random() * (26)) - 12;
            x[i] = b;
            System.out.printf("%5.5f", x[i]);
            System.out.print(" ");


        }
        System.out.println();

        double[][] alpha = new double[15][16];
        for (i = 0; i <= 14; i++) {
            for (j = 0; j <= 15; j++) {
                double z = x[j];
                if (a[i] == 4 || a[i] == 7 || a[i] == 8 || a[i] == 9 || a[i] == 14 || a[i] == 15 || a[i] == 16 || a[i] == 17){
                    if (a[i] == 7){
                        alpha[i][j] = (double) Math.sin(4*(Math.pow((z/4),z)-2));
                    }
                    else {
                        double k1 = (double) (((2/3) - z)/(Math.PI));
                        double k2 = (double) Math.pow(z,k1);
                        double k3 = (double) Math.cos(k2)/3;
                        alpha[i][j] = (double) Math.pow(k3,Math.tan(Math.tan(z)));
                    }
                }
                else {
                    double m1 = (double) Math.atan(((z+1)/26));
                    double m2 = 2*m1;
                    double m3 = (double) Math.pow(z,(z*(z-4)));
                    double m4 = (double) Math.pow(m2,m3);
                    alpha[i][j] = (double) Math.asin(Math.cos(Math.asin(Math.cos(m4))));


                }

                System.out.printf("%13.5f",alpha[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}