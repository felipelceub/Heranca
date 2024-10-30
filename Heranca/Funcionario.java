package Heranca;

public class Funcionario extends Pessoa{

	private String setor;
	private double salario;
	
	public Funcionario(String nome, int idade, String setor, double salario) {
		super(nome, idade);
		this.setor = setor;
		this.salario = salario;
	}
	
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Setor: "+ this.setor);
		System.out.println("Salário: "+ this.salario);
	}
	
	
}