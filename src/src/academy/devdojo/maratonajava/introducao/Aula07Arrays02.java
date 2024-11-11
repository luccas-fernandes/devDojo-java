package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // valores padrao de inicialização
        // byte, short, long, int, float e double = 0
        // char '\u0000' = ' '
        // boolean = false
        // references = null

        int idades [] = new int[2];
        idades[0] = 20;
        idades[1] = 18;
        
        for (int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }
    }
}
