public class EratosthenesPrimeSieve implements PrimeSieveI {

    public static int upperLimit = 500;
    public static boolean[] primeArray = new boolean[upperLimit + 1]; // false = prime, true = non-prime


    public static void sieve() {

        primeArray[0] = true;
        primeArray[1] = true;

        for (int i = 2; i <= Math.sqrt(upperLimit); i++) {
            if (!primeArray[i]) {
                for (int j = i * i; j <= upperLimit; j += i) {
                    primeArray[j] = true;
                }
            }
        }
    }

    public static boolean isPrime(int p) {
        if (p <= 1) {
            return false;
        }
        return !primeArray[p];
    }


    public static void printPrimes() {
        sieve();
        for (int i = 2; i <= upperLimit; i++) {
            if (!primeArray[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
