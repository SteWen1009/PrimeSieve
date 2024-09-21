public class EratosthenesPrimeSieve implements PrimeSieveI {

    public static int upperLimit = 500;
    public static boolean[] primeArray = new boolean[upperLimit + 1];


    public static boolean isPrime(int p) {
        for (int i = 2; i <= Math.sqrt(upperLimit); i++) {
            if (!primeArray[i]) {

                for (int j = i * i; j <= upperLimit; j += i) {
                    primeArray[j] = true;
                    return true;
                }

            }

        }

        return false;
    }


    public static void printPrimes() {
        for (int i = 2; i <= upperLimit; i++) {
            if (!primeArray[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
