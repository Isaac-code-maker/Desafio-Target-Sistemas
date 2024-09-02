import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int n = scanner.nextInt();

        if (isFibonacci(n)) {
            System.out.println(n + " pertence à seguencia Fibonacci");

            System.out.println("Sequência de Fibonacci até " + n + ":");  
            fibonacci(n);

        } else {
            System.out.println(n + " não percente à seguqneica FIbonacci");
        }

    }

    public static boolean isFibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;

        if (n == a || n == b) {
            return true;
        }
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
            if (c == n) {
                return true;

            }
        }
        return false;
    }

    public static void fibonacci(int n){
        int a = 0, b = 1;  

        if (n >= a) {  
            System.out.print(a + " ");  
        }  
        if (n >= b) {  
            System.out.print(b + " ");  
        }  

        int c = a + b;  
        while (c <= n) {  
            System.out.print(c + " ");  
            a = b;  
            b = c;  
            c = a + b;  
        }  
        System.out.println();  
    }
}
