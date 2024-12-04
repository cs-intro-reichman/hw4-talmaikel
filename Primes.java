public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n+1];
        double count = 0;

            for (int i = 2; i < n+1; i++)  isPrime[i] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = i * 2; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
        
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++)  {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }

    
        System.out.println("There are " + (int) count + " primes between 2 and " + n + " (" + (int) ((count / n) * 100) + "% are primes)");
    }
}
