import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print ("Digite um numero");
        int numero = input.nextInt();

        System.out.print ("Digite um numero");
        int numero2 = input.nextInt();

        int soma = numero + numero2;

        System.out.println("a soma dos numeros " + numero + " e " + numero2 + " " + "é igual a" +" "+ soma);
        
        if (soma % 2 == 0) {
            System.out.print ("Numero é par");
        }
        else{
            System.out.print ("Numero é impar");
        }
        
        input.close();
    }
}
