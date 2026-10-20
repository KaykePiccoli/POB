package exercicios.exercicios12.questao03;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Aluno> alunos = Arrays.asList(
            new Aluno("Ana", "ADS", 9.0),
            new Aluno("Carlos", "Engenharia", 6.5),
            new Aluno("Beatriz", "ADS", 8.5),
            new Aluno("Daniel", "Direito", 7.0),
            new Aluno("Eduarda", "Engenharia", 9.5),
            new Aluno("Felipe", "Direito", 5.0)
        );

        // 1. Agrupamento dos alunos por curso
        Map<String, List<Aluno>> alunosPorCurso =
            alunos.stream()
                .collect(Collectors.groupingBy(Aluno::getCurso));

        System.out.println("=== ALUNOS POR CURSO ===");

        alunosPorCurso.forEach((curso, lista) -> {
            System.out.println("Curso: " + curso);
            lista.forEach(System.out::println);
        });

        // 2. Particionamento por aprovação
        Map<Boolean, List<Aluno>> alunosPorSituacao =
            alunos.stream()
                .collect(Collectors.partitioningBy(
                    aluno -> aluno.getNotaFinal() > 7.0
                ));

        System.out.println("\n=== ALUNOS APROVADOS ===");
        alunosPorSituacao.get(true)
            .forEach(System.out::println);

        System.out.println("\n=== ALUNOS REPROVADOS ===");
        alunosPorSituacao.get(false)
            .forEach(System.out::println);
    }
}
