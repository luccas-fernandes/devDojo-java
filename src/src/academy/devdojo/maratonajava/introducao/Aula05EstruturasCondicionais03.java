package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        // operador ternario = (condicao) ? verdadeiro:falso;
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas terei";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;


        System.out.println(resultado);
    }
}
