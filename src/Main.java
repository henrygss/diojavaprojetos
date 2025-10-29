import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main{
    static void main(String [] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso 2");
        curso2.setDescricao("Descrição curso 2");
        curso2.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso1);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHenry = new Dev();
        devHenry.setNome("Henry");
        devHenry.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos:" + devHenry.getConteudosInscritos());
        devHenry.progredir();
        devHenry.progredir();
        System.out.println("Conteúdos concluídos:" + devHenry.getConteudosConcluidos());
        System.out.println("Conteúdos incritos:" + devHenry.getConteudosInscritos());
        System.out.println("XP:" + devHenry.calcularTotalXp());



        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos:" + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos concluídos:" + dev2.getConteudosConcluidos());
        System.out.println("Conteúdos incritos:" + dev2.getConteudosInscritos());
        System.out.println("XP:" + dev2.calcularTotalXp());







    }
}
