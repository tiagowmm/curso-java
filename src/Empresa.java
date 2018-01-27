import java.util.Arrays;

public class Empresa {

	private String nome;
	private String cnpj;
	private Funcionario[] empregados;
	private static int posicaoLivre = 0;
	
	public Empresa() {
	}

	public Empresa(Funcionario[] empregados) {
		super();
		this.empregados = empregados;
	}

	public void adicionar(Funcionario novoFuncionario) {
		empregados[this.posicaoLivre] = novoFuncionario;
		this.posicaoLivre++;
	}

	public void mostraEmpregados() {
		for (int i = 0; i < empregados.length; i++) {
			this.empregados[i].mostra();
		}
	}

	public boolean contem(Funcionario f) {
		for (int i = 0; i < empregados.length; i++) {
			if (this.empregados[i] == f) {
				return true;
			}
		}
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario[] getEmpregados() {
		return empregados;
	}

	public void setEmpregados(Funcionario[] empregados) {
		this.empregados = empregados;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empresa [nome=");
		builder.append(nome);
		builder.append(", cnpj=");
		builder.append(cnpj);
		builder.append(", empregados=");
		builder.append(Arrays.toString(empregados));
		builder.append(", posicaoLivre=");
		builder.append(posicaoLivre);
		builder.append("]");
		return builder.toString();
	}

}
