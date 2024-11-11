package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int[3];

        int [] numeros2 = {1, 2, 3, 4, 5}; // outra forma de inicializar

        int [] numeros3 = new int[] {1, 2, 3, 4, 5}; // outra forma

      //  for (int i = 0; i < numeros2.length; i++) {
        //     System.out.println(numeros2[i]);
        //}

        // foreach
        // não é capaz de acessar os indices especificos

        for (int num : numeros3){
            System.out.println(num);
        }
    }
}
