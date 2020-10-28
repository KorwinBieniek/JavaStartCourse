package pl.javastart.Recursion;

public class FactorialApp {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(9));
    }

    public static int calculateFactorial(int num){
        if(num <= 1){
            return 1;
        }
        else{
            return  num * calculateFactorial(num-1);
        }
    }
}
