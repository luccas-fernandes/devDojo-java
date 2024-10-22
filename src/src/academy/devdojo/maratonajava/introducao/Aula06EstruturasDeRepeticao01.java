package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;

        while(count < 10){
            // o estado da variavel deve mudar dentro do escopo do while
            System.out.println(count);
            count++;
        }

        // do while executa pelo menos uma vez, independente da condição
        count = 0;
        do{
            System.out.println("dentro do do-while"+ count++);
        }while(count < 10);

        // for serve mais para iteração em si
        for(int i = 0; i < 10;i++){
            System.out.println("For "+ i);
        }
    }
}
