package exercicios.exercicios04;
import java.util.Scanner;

public class SeparaParImpar {
    //Crie um programa que leia 10 números inteiros e os armazene em um vetor original. 
    // Em seguida, distribua os valores em dois novos vetores: 
    // um contendo apenas os números pares e outro contendo apenas os ímpares. 
    // Ao final, exiba os elementos de cada um dos novos vetores.

    public static void main(String[] args) {
        int i, j=0, k=0;
        int[] vetor = new int[10];
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        Scanner sc = new Scanner(System.in);
        for(i=0; i<10; i++) {
            System.out.println("Informe um numero: ");
            vetor[i]=sc.nextInt();
        }

        for(i=0; i<10; i++) {
            if(vetor[i]%2==0) {
                vetorA[j]=vetor[i];
                j++;
            }else{
                vetorB[k]=vetor[i];
                k++;
            }
        }

        System.out.println("Numeros pares: ");
        for (i=0; i<j; i++) {
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Numeros impares: ");
        for (i=0; i<k; i++) {
            System.out.println(vetorB[i] + " ");
        }

        sc.close();
    }
}