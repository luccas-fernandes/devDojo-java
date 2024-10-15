package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        // if ( condição booleana) {}
        // is em nome de variaveis = usado para determinar condições

        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida");
        }else{
            System.out.println("Não autorizado a comprar bebida");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não Autorizado a comprar bebida");
        }
        System.out.println("fora do if");
    }
}
