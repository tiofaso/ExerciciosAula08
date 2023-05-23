import java.util.Date;
import java.util.Scanner;
import java.util.Date;

//Calcula a idade da pessoa em meses, dias e anos
public class Exercicio04AnosMesesDias {
    public static void main(String[] args){
        System.out.println("Digite o dia do seu nascimento (ex.: 27): ");
        Scanner diaPessoa = new Scanner(System.in);
        int diaNascimento = diaPessoa.nextInt();

        System.out.println("Digite o número do mês em que você nasceu (ex.: para março digite 03): ");
        Scanner mesPessoa = new Scanner(System.in);
        int mesNacimento = mesPessoa.nextInt();

        System.out.println("Digite o ano em que você nasceu (ex.: 1983): ");
        Scanner anoPessoa = new Scanner(System.in);
        int anoNacimento = anoPessoa.nextInt();

        Date calculaAno = new Date();
        Date calculaMes = new Date();

        int idadeAnos = (calculaAno.getYear() + 1900 - anoNacimento); //Calcula a idade da pessoa
        int mesVivido =  (calculaMes.getMonth() + 1 ) - mesNacimento; //Calcula a quantidade de meses vivivos
        int diasVividosAtual = mesVivido * 30; //Calcula quantos dias ela já viveu no ano corrente
        int diasVividosNacimento = (anoNacimento * 365) + diasVividosAtual; //Calcula quantos dias viveu desde o nascimento
        System.out.println("Você tem " + idadeAnos + " anos, isso significa que você viveu até agora " + idadeAnos + " anos, " + mesVivido  + " meses e " + diasVividosAtual + " dias nesse ano." + " Até hoje você viveu um total de " + diasVividosNacimento + " dias!!!");

    }// fim do static void

}
