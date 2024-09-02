import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a string: ");
        String scan = scanner.nextLine();

        int count = VerificaA(scan);
        if (count > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não aparece na string.");
        }
    }

    public static int VerificaA(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }

}
