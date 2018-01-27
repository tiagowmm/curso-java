
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Any");
		f1.setDataAdmissao(new Data());
		f1.setSalario(10000.0);
		f1.recebeAumento(1000);
		
		System.out.println(f1.getSalario());
		
		double ganhoAnual = f1.getGanhoAnual();
		System.out.println(ganhoAnual);
		
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Bob");
		f2.setDataAdmissao(new Data());
		f2.setSalario(10000.0);
		f2.recebeAumento(1000);
		
		if (f1 == f2) {
			System.out.println("Funcionarios iguais...");
		} else {
			System.out.println("Funcionarios diferentes...");
		}
		
		f1.mostra();
		f2.mostra();
		
		System.out.println(f1);
		System.out.println(f2);
		
	}

}
