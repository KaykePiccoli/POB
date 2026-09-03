package exercicios.exercicios04;

public class MediaTurma {
    //Desenvolva um programa que armazene as notas finais de 8 alunos em um vetor do tipo double. 
    // Calcule a média aritmética da turma e, em um segundo laço, 
    // exiba quais notas ficaram estritamente acima da média calculada.

    public static void main(String [] args){
        int i;
        double media=0;
        double[] notas = {2.5, 8.1, 3.4, 10, 7.5, 5.7, 9, 0};

        //percorre o for e calcula a media
        for(i=0; i<8; i++){
            media+= notas[i];
            
        }
        media=media/8;
        for(i=0; i<8; i++){
            if(notas[i] > media){
                System.out.println(" "+ notas[i]);
            }
        }
    }
}
