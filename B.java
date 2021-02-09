import java.math.BigInteger;

class B {
    private static int n = Main.getN();
    private static int g = Main.getG();
    static int y;                     //generuje liczbe z przedzialu 100-999
    static BigInteger Y;
    static BigInteger k;
    private static BigInteger gg = new BigInteger("" + g);
    private static BigInteger nn = new BigInteger("" + n);


    static void get_Y(){
        BigInteger pow = gg.pow(y);
        Y = pow.mod(nn);
    }

    static void calculate_k(){
        BigInteger pow = A.X.pow(y);
        k = pow.mod(nn);
    }
}
