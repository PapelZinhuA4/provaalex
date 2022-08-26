//Israel e João Luis 3-52
// 10 Feita em sala

import java.util.Scanner;

public class Ex_10 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int antecessor,  um_numero;
        System.out.print("Digite o valor do um numero: ");
        um_numero = in.nextInt();
        in.nextLine();
        antecessor=um_numero-1;
        System.out.println("O valor do antecessor: " + antecessor);
       
    }
}

