import java.math.BigInteger;
import java.security.SecureRandom;

class A {
    private static int n = Main.getN();
    private static int g = Main.getG();
    static int x;                     //generuje liczbe z przedzialu 100-999
    static BigInteger X;
    static BigInteger k;
    private static BigInteger gg = new BigInteger("" + g);
    private static BigInteger nn = new BigInteger("" + n);


    static void get_X(){
        BigInteger pow = gg.pow(x);
        X = pow.mod(nn);
    }

    static void calculate_k(){
        BigInteger pow = B.Y.pow(x);
        k = pow.mod(nn);
    }
}
