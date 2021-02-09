import java.security.SecureRandom;

public class Main {

    static int getN() {
        return n;
    }

    static int getG() {
        return g;
    }

    private static int n, g;
    private static SecureRandom rand = new SecureRandom();

    private static boolean isPrime(int num){
        if (num < 2)
            return false;
        for(int i=2; i < num/2; i++)
        {
            if(num%i == 0)
                return false;
        }
        return true;
    }

    private static int generatePrime() {
        int num;
        do {
            int min = 1000000;
            int max = 9999999;
            num = rand.nextInt((max - min) + 1) + min;
        } while (!isPrime(num));
        return num;
    }

    private static int generate(){
        assert rand != null;
        return rand.nextInt((999999 - 100000)+1)+ 100000;
    }

    private static int NWD(int a, int b) {
        return b==0 ? a : NWD(b, a%b);
    }

    private static int countRoots(int n){
        int result = 1;
        for(int i = 2; i<n; i++)
        {
            if(NWD(i,n) == 1)
                result++;
        }
        return result;
    }

    private static int generateG(){
        do {
            g = countRoots(n - 1);
        } while (g <= 1 || g >= n);
        return g;
    }

    public static void main(String[] args){

        rand.nextInt();
        n = generatePrime();
        g = generateG();
        System.out.println("\nn= " + n + "\ng= "+ g);
        A.x = generate();
        B.y = generate();
        System.out.print("\nKlucz przywatny x= " + A.x + "\nKlucz prywatny y= " + B.y);

        A.get_X();
        B.get_Y();
        System.out.println("\nX= "+A.X + "\nY= " + B.Y);

        A.calculate_k();
        B.calculate_k();
        System.out.print("\nKlucz k dla A: " + A.k + "\nKlucz k dla B: "+ B.k + "\n");
    }

}
