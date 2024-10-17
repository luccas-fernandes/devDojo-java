package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 5500;

        double aliquota01 = salario * 0.075;
        double aliquota02 = salario * 0.15;
        double aliquota03 = salario * 0.225;
        double aliquota04 = salario * 0.275;

        boolean isAliquota01 = salario <= 2826.65;
        boolean isAliquota02 = salario <= 3751.05;
        boolean isAliquota03 = salario <= 4664.68;
        boolean isAliquota04 = salario > 4664.68;

        if (isAliquota01){
            salario += aliquota01;
            System.out.println("Salario com imposto (aliquota 01) : " + salario);
        }
        else if (isAliquota02){
            salario += aliquota02;
            System.out.println("Salario com imposto (aliquota 02) : " + salario);
        }
        else if (isAliquota03){
            salario += aliquota03;
            System.out.println("Salario com imposto (aliquota 03) : " + salario);
        }else{
            salario += aliquota04;
            System.out.println("Salario com imposto (aliquota04) : " + salario);
        }

    }
}
