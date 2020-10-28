package pl.javastart.Recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(fibonacci(100));
        long end = System.nanoTime() - start;

        System.out.println("The program has been running for " + (end/1000000000) + " seconds");
    }

    public static long fibonacci(long num){
        if(num == 1 || num == 2){
            return 1;
        }
        else{
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
}
