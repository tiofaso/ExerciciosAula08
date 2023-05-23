import java.util.Scanner;

//Exercício do João Papo-de-pescador
public class Exercicio01PesoPeixe {
    public static void main(String[] args){
        System.out.println("Digite o peso do peixe: ");
        Scanner pesoPeixe = new Scanner(System.in);

        double quantoPesaPeixe = pesoPeixe.nextDouble();

        if(quantoPesaPeixe <= 50){ //Peixe com peso dentro dos padrões
            System.out.println("O seu peixe pesa " + quantoPesaPeixe + "kg e está dentro dos padrões do Estado de SP.");
        }else if(quantoPesaPeixe > 50) { //Peixe fora dos padrões
            System.out.println("O seu peixe está fora dos padrões. Possui " + (quantoPesaPeixe - 50) + "kg a mais (total de " + quantoPesaPeixe + "kg) e você precisará pagar R$" + ((quantoPesaPeixe - 50)*4) + " de multa.");
        }// fim do if
    }// fim do static void
}// fim da classe Exercicio01
