import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl zwischen 1 und 500 ein");
        int number = Integer.parseInt(sc.nextLine());
        Boolean isPrime = EratosthenesPrimeSieve.isPrime(number);
        if (isPrime) {
            System.out.println("Diese Zahl ist eine Primzahl");
        } else {
            System.out.println("Diese Zahl ist keine Primzahl");
        }
        EratosthenesPrimeSieve.printPrimes();
    }
}
