import java.util.Scanner;
import java.text.DecimalFormat;

//Exercício do cálculo IMC
public class Exercio02CalculoIMC {
        public static void main(String[] args){

            System.out.println("Digite a sua altura (apenas números): ");
            Scanner altura = new Scanner(System.in);
            double suaAltura = altura.nextDouble();

            System.out.println("Digite o seu peso (apenas números): ");
            Scanner peso = new Scanner(System.in);
            double seuPeso = peso.nextDouble();

            double seuImc = seuPeso / (suaAltura * suaAltura);
            String infoImc = ""; //armazena a mensagem amigável sobre o IMC

            //verificando o peso da pessoa de acordo com a tabela de IMC
            if(seuImc <= 16.9) {infoImc = "Muito abaixo do peso";}
            else if (seuImc >= 17 && seuImc <= 18.4) {infoImc = "Abaixo do peso";}
            else if (seuImc >= 18.5 && seuImc <= 24.9) {infoImc = "Peso normal";}
            else if (seuImc >= 25 && seuImc <= 29.9) {infoImc = "Acima do peso";}
            else if (seuImc >= 30 && seuImc <= 34.9) {infoImc = "Obesidade grau I";}
            else if (seuImc >= 35 && seuImc <= 40) {infoImc = "Obesidade grau II";}
            else if (seuImc > 40) {infoImc = "Obesidade grau III";}

            DecimalFormat formatador = new DecimalFormat("0.00");

            System.out.println("O seu IMC é de " + formatador.format(seuImc) + " (" + infoImc + ")" );
        }
}


