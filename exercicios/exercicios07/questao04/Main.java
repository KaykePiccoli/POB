package exercicios.exercicios07.questao04;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Civic", 2024);

        System.out.println("Modelo: " + carro.getModelo() + " | Ano: " + carro.getAno());
        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual());
        System.out.println("Em movimento? " + carro.isEmMovimento());

        carro.acelerar(60);
        System.out.println("\nApós acelerar 60 km/h -> Velocidade: " + carro.getVelocidadeAtual());
        System.out.println("Em movimento? " + carro.isEmMovimento());

        carro.frear(80); // não pode ficar negativo
        System.out.println("\nApós frear 80 km/h -> Velocidade: " + carro.getVelocidadeAtual());
        System.out.println("Em movimento? " + carro.isEmMovimento());

        carro.setModelo("Civic Touring");
        System.out.println("\nModelo atualizado: " + carro.getModelo());
    }
}
