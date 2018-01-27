
public class TestaEmpresa {

	public static void main(String[] args) {

		Empresa emp1 = new Empresa();
		emp1.setEmpregados(new Funcionario[10]);

		for (int i = 0; i < emp1.getEmpregados().length; i++) {
			Funcionario f = new Funcionario();
			f.setNome("Flin");
			f.setSalario(4000);
			f.recebeAumento(150);
			emp1.adicionar(f);
		}
		emp1.mostraEmpregados();

	}

}
