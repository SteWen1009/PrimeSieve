public class EratosthenesPrimeSieve implements PrimeSieveI {

    public static int upperLimit = 500;
    public static boolean[] primeArray = new boolean[upperLimit + 1];

    public static void checkPrimeNumber() {
        for (int i = 2; i <= Math.sqrt(upperLimit); i++) {
            if (!primeArray[i]) {
                System.out.print(i + ", ");

                for (int j = i * i; j <= upperLimit; j += i) {
                    primeArray[j] = true;
                }

            }

        }
        // Gib die Primzahlen größer als Wurzel(N) aus
        for (int i = (int) Math.sqrt(upperLimit) + 1; i <= upperLimit; i++) {
            if (!primeArray[i]) {
                System.out.print(i + ", ");
            }
        }
    }

    @Override
    public boolean isPrime(int p) {

        return false;
    }

    @Override
    public void printPrimes() {

    }
}
