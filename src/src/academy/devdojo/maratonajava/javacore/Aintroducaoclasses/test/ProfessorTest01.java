package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nomeProfessor = "Mestre Kami";
        professor.idadeProfessor = 140;
        professor.sexoProfessor = 'M';
        System.out.println(professor.nomeProfessor + " " + professor.idadeProfessor + " " + professor.sexoProfessor);
    }
}
