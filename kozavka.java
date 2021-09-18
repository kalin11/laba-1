public class kozavka {
    public static void First(){
        long[] a = new long[15];
        int i;
        int n=3;
        for (i=0;i<=14;i++){
            a[i]=n;
            n++;

            System.out.print(a[i]+ " ");
        }
    }

    public static void Second(){
        float[] x = new float[16];
        int i;
        float b;
        for (i = 0; i <= 15; i++) {
            b = (float) (Math.random() * (26 + 1)) - 12;
            if (b >= -12.0 && b <= 14.0) {
                x[i] = b;
            }
            System.out.printf("%.5f",x[i]);
            System.out.print(" ");

        }
    }
    public static void Third(){
        char [][] a1 = new char [15][16];

    }
    public static void main(String[] args){
        First();
        System.out.println();
        Second();

    }
}
