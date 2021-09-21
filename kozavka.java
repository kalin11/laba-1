public class laba {
    public static long[] First(){
        int i;
        int n = 3;
        long[] b = new long [15];
        for (i = 0; i <= 14; i++){
            b[i] = n;
            n++;
        }
        return b;
    }
    public static float[] Second(){
        int i;
        float[] c = new float[16];
        float k;
        for (i = 0; i <= 15; i++){
            k = (float) (Math.random() * 26)-12;
            c[i] = k;

        }
        return c;
    }
    public static double[][] Third(){
        long[] a1 = First();
        float[] x1 = Second();
        int i,j;
        float[] m = new float[16];
        System.out.print("Second task is: ");
        for (j = 0; j<=15;j++){
            m[j]=x1[j];
            System.out.printf("%5.5f",m[j]);
            System.out.print(" ");

        }
        System.out.println();
        double[][] d = new double[15][16];
        for (i = 0; i <= 14; i++){
            for (j = 0; j <= 15;j++){
                double z = m[j];
                if (a1[i] == 4 || a1[i] == 7 || a1[i] == 8 || a1[i] == 9 || a1[i] == 14 || a1[i] == 15 || a1[i] == 16 || a1[i] == 17){
                    if (a1[i] == 7){
                        d[i][j] = (double) Math.sin(4 * (Math.pow((z/4),z) - 2));
                    }
                    else {
                        double m1 = (double) ((2/3) - z)/(Math.PI);
                        double m2 = (double) Math.pow(z,m1);
                        double m3 = (double) (Math.cos(m2))/3;
                        double m4 = (double) (Math.pow(m3, Math.tan(Math.tan(z))));
                        d[i][j] = m4;
                    }
                }
                else {
                    double k1 = (double) (z+1)/26;
                    double k2 = (double) 2*Math.atan(k1);
                    double k3 = (double) Math.pow(z, (z * (z-4)));
                    double k4 = (double) Math.pow(k2, k3);
                    double k5 = (double) Math.cos(k4);
                    double k6 = (double) Math.asin(k5);
                    double k7 = (double) Math.cos(k6);
                    double k8 = (double) Math.asin(k7);
                    d[i][j] = k8;
                }

            }
        }
        return d;
    }
    public static void main(String[] args){
        long[] a = First();
        int i,j;
        System.out.print("First task is: ");
        for (i = 0; i <= 14; i++){

            System.out.print(a[i] + " ");
        }
        System.out.println();
        double[][] alpha = Third();
        System.out.print("Third task is: ");
        System.out.println();
        for (i = 0; i <= 14; i++){
            for (j = 0; j <= 15; j++){
                System.out.printf("%13.5f",alpha[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
