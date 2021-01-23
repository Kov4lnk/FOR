package Ray.Andy;

public class Main {

    public static void main(String[] args) {
        for(int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",  calculateInterest(10000.0, (double) i)));
        }
        // /String.format("%.2f") remove the reamaining with a lot of 0000000000 to only two of them: 700.0000000000001 will change to 700.00

        for(int i = 8; i > 1; i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",  calculateInterest(10000.0, (double) i)));
        }

        int count = 0;
        for (int i = 10; i < 50; i++){
            if (isPrime(i)){
                count ++;
                System.out.println("It is a PRIME NUMBER - " + i);
                if (count == 10){
                    System.out.println("Exiting the loop");
                    break;
                }
            }
        }
    }



    public static boolean isPrime(int n){

        if (n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++){
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
