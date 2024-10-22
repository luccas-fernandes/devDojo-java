package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // dado valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condicao = valorParcela >= 1000;
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double ValorParcela = valorTotal / parcela;
            if(ValorParcela >= 1000){
                System.out.println("Parcela " + parcela + "R$ " + ValorParcela);
            }else{
                break;
            }
        }
    }
}
