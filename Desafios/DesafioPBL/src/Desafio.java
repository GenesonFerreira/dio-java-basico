//para ler e escrever dados em java, padronizamos da seguinte forma:
//- new Scanner(System.in): cria um leitor de entrada, com metodos uteis com prefixo "next";
//- System.out.println:. imprime um texto de Saida (Output) e pulando uma linha
import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) throws Exception {
        //Le os valores de entrada e trata possiveis erros
        Scanner leitorDeEntradas = new Scanner(System.in);
            System.out.println("Informe o valor do Salario");
            float valorSalario = leitorDeEntradas.nextFloat();
            System.out.println("informe o valor dos beneficios");
            float valorBeneficios = leitorDeEntradas.nextFloat();

            float valorImposto = 0;
            if (valorSalario >= 0 && valorSalario <= 1100) {
                //Atribuiu a aliquota de 5% mediante salario:
                valorImposto = 0.05F * valorSalario;
            } else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
                //Atribuiu a aliquota de 10% mediante salario:
                valorImposto = 0.1F * valorSalario;
            } else  {
                //Atribuiu a aliquota de 15% mediante salario:
                valorImposto = 0.15F * valorSalario;
            }
            //TODO Criar as demais condicoes para as aliquotas de 10.00% e 15.00%.

            //Calcula e imprime a saida ( com 2 casas decimais)
            float saida = valorSalario - valorImposto + valorBeneficios;
            System.out.println("valor do salario mais benefiocios: " + String.format("%.2f", saida));
        
    }
}
