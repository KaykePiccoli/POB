package exercicios.exericios08.questao02;

public class Gerente extends Funcionario{
    private Double bonusFixo;

    public Gerente(String nome, Double salarioBase, double bonusFixo){
        super(nome, salarioBase);
        this.bonusFixo=bonusFixo;
    }

    @override
    public void calcularsalario(){
        
        salarioBase= bonusFixo+salarioBase;
        return salarioBase;
    }
}