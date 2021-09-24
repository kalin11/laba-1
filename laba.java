import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class kozavka {
    private static final Set<Long> check = new HashSet<Long>() {{
        add(4L); 
        add(8L);
        add(9L); 
        add(14L);
        add(15L);
        add(16L);
        add(17L);
    }};
    public static long[] first() {
        int n = 3;
        long[] b = new long[15];
        for (int i = 0; i <= 14; i++) {
            b[i] = n;
            n++;
        }
        return b;
    }

    public static float[] second() {
        float[] c = new float[16];
        Random rand = new Random();
        for (int i = 0; i <= 15; i++) {
            c[i] = (rand.nextFloat() * 26) - 12;
        }
        return c;
    }

    public static double firstmath(float x){
        return  Math.sin(4 * (Math.pow((x / 4), x) - 2));
    }
    public static double secondmath(float x){
        double m1 = (double) ((2 / 3) - x) / (Math.PI);
        double m2 = Math.pow(x, m1);
        double m3 = (Math.cos(m2)) / 3;
        return  (Math.pow(m3, Math.tan(Math.tan(x))));
    }
    public static double thirdmath(float x){
        double k1 = (x + 1) / 26;
        double k2 = 2 * Math.atan(k1);
        double k3 = Math.pow(x, (x * (x - 4)));
        double k4 = Math.pow(k2, k3);
        double k5 = Math.cos(k4);
        double k6 = Math.asin(k5);
        double k7 = Math.cos(k6);
        return Math.asin(k7);
    }

    public static double[][] third(long[] a, float[] b) {
        float[] m = new float[16];
        for (int j = 0; j <= 15; j++) {
            m[j] = b[j];
        }

        System.out.println();

        double[][] d = new double[15][16];
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= b.length - 1; j++) {
                if (check.contains(a[i])){
                    d[i][j] = secondmath(m[j]);

                }
                else if (a[i] == 7){
                    d[i][j] = firstmath(m[j]);

                }
                else{
                    d[i][j] = thirdmath(m[j]);
                }
            }
        }
        return d;
    }

    public static void main(String[] args) {
        long[] a = first();
        float[] x = second();
        int i, j;
        System.out.print("First task is: ");
        for (i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("Second task is : ");
        for (j = 0; j <= x.length - 1; j++){
            System.out.print(x[j] + " ");

        }
        System.out.println();
        double[][] alpha = third(a, x);
        System.out.print("Third task is: ");
        System.out.println();
        for (i = 0; i <= a.length - 1; i++) {
            for (j = 0; j <= x.length - 1; j++) {
                System.out.printf("%13.5f", alpha[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
