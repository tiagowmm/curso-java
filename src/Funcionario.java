
public class Funcionario {
	
	private static int proximoIdentificador = 0;

	private int identificador;
	private String nome;
	private String departamento;
	private double salario;
	private Data dataAdmissao;
	private String rg;

	public Funcionario() {
		super();
		this.identificador = ++proximoIdentificador;
		this.dataAdmissao = new Data();
	}

	public Funcionario(String nome, double salario) {
		this();
		this.nome = nome;
		this.salario = salario;
	}

	public void recebeAumento(double valor) {
		this.salario += valor;
	}

	public double getGanhoAnual() {
		return this.salario * 12;
	}

	public void mostra() {
		System.out.println("Identificador: " + this.identificador);
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário: R$ " + this.salario);
		System.out.println("Admissão: " + dataAdmissao.getFormatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Ganho Anual: R$ " + this.getGanhoAnual());
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Data dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [nome=");
		builder.append(nome);
		builder.append(", departamento=");
		builder.append(departamento);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", dataAdmissao=");
		builder.append(dataAdmissao.getFormatada());
		builder.append(", rg=");
		builder.append(rg);
		builder.append("]");
		return builder.toString();
	}

}
