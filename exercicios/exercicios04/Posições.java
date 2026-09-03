package exercicios.exercicios04;

public class Posições{
    
    public static void main(String [] args){
        int i, menor=1, maior=1, posMenor= 0, posMaior= 0;
        int[] vetor = {3, 4, 6, 8, 1, 10, 12, 14, 25, 0};

        for(i=0;i<10;i++){
            if(vetor[i] < menor){
                menor= vetor[i];
                posMenor = i;
            }
            if(vetor[i] > maior){
                maior= vetor[i];
                posMaior = i;
            }
        }
        //ajustando as posições corretamente
        posMaior++;
        posMenor++;
        System.out.println("A maior valor é " + maior + " e se encontra na posição " + posMaior);
        System.out.println("A menor valor é " + menor + " e se encontra na posição " + posMenor);
    }
}