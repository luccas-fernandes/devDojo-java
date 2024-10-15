package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 = categoria infantil
        // idade >= 15 && < 18 = juvenil
        // idade >= 18 = adulto
        int idade = 19;
        boolean isCategoriaInfantil = idade < 15;
        boolean isCategoriaJuvenil = idade >= 15 && idade < 18;
        boolean isCategoriaAdulto = idade >= 18;

        if (isCategoriaInfantil) {
            System.out.println("Categoria Infantil");
        }else if(isCategoriaJuvenil){
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Categoria Adulto");
        }


    }
}
