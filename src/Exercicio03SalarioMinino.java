import java.util.Scanner;
import java.text.DecimalFormat;

//Exercício do calculo do valor do salário mínimo
    public class Exercicio03SalarioMinino {
    public static void main(String[] args){
        System.out.println("Digite valor do seu salário: ");
        Scanner meuSalario = new Scanner(System.in);

        double emSalariosMinimos = (meuSalario.nextDouble()/1212);

        DecimalFormat formatador = new DecimalFormat("0.00");

       System.out.println("O seu salário equivale a " + formatador.format(emSalariosMinimos) + " em salários mínimos.");

    }// fim do static void
}// fim da classe Exercicio01
