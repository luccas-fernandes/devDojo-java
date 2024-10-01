package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // operadores básicos = +, -, /, *

        int numero01 = 10;
        int numero02 = 20;

        // variavel + variavel = soma
        // string + sinal de  + = concatenação
        // o resultado da operação de dois int é sempre um int

        System.out.println(numero01 + numero02);

        // operadores relacionais

        // % => resto
        int resto = 20 % 2;
        System.out.println(resto);

        // < menor que; maior que >; <= menor ou igual, maior ou igual >=; == igual
        // sempre retornam valores boleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("IsDezMaiorQueVinte = " + isDezMaiorQueVinte);

        // operadores lógicos
        // AND (&&); OR (||), NOT (!)
        int idade = 25;
        int salario = 3000;
        boolean taNoCaminhoCerto = idade > 20 && salario > 2500;
        System.out.println(taNoCaminhoCerto);

        // operadores de atribuição
        // = ; += ; -= ; *= ; /= ; %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
    }
}
