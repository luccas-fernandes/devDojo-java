package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // exercicio = todos os numeros pares ate 1000000
        for(int i = 0; i <= 1000000; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
