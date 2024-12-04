public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i < n; i++)  isPrime[i] = true;

        for (int i = 2; i < Math.sqrt(n+1); i++) {
            for (int j = i*2; j < n+1; j += i) {
                isPrime[j] = false;
            }
            while(isPrime[i+1] == false){
                i++;
            }
        }
        for (int i = 2; i < n; i++)  if (isPrime[i] == true) System.out.println(i);
}
}