package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para campos descritos abaixo entre <> e imprima a seguinte mensagem:
 eu <Nome>, morando no endereço <endereço>, confirmo que recebi o salário <salario>, na data <data>

 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Luccas";
        String endereco = "Av. Pinheiros";
        double salario = 1500.00;
        String dataRecebimentoSalario = "26/09/2024";
        String relatorio = "Eu " + nome +", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + " reais, na data de " + dataRecebimentoSalario;
        System.out.println(relatorio);
    }

}
