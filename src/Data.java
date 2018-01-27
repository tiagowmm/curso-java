import java.util.Calendar;
import java.util.Date;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	public Data() {
		super();
	}

	public Data(int dia, int mes, int ano) {
		super();
		if (isDataViavel(dia, mes, ano)) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else {
			throw new IllegalArgumentException("A data informada é inválida.");
		}
	}
	
	public Data(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		this.dia = calendar.get(Calendar.DATE);
		this.mes = calendar.get(Calendar.MONTH + 1);
		this.ano = calendar.get(Calendar.YEAR);
	}
	
	public Data(Calendar calendar) {
		this(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH + 1), calendar.get(Calendar.YEAR));
	}

	private boolean isDataViavel(int dia, int mes, int ano) {
		
		if (dia <= 0 || mes <= 0 || mes > 12) {
			return false;
		}
		
		int ultimoDiaMes = 31;
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			ultimoDiaMes = 30;
		} else if (mes == 2) {
			ultimoDiaMes = 28;
			if ((ano % 400 == 0) || ((ano % 400 == 0) && (ano % 100 != 0))) {
				ultimoDiaMes = 29;
			}
		}
		
		if (dia > ultimoDiaMes) {
			return false;
		}
		return true;
	}
	
	public Date getDate() {
		return getCalendar().getTime();
	}
	
	public Calendar getCalendar() {
		Calendar c = Calendar.getInstance();
		c.set(this.ano, (this.mes-1), this.dia);
		return c;
	}

	public String getFormatada() {
		return (this.dia < 10 ? "0" + this.dia : this.dia) + "/" + (this.mes < 10 ? "0" + this.mes : this.mes) + "/" + this.ano;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + dia;
		result = prime * result + mes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Data)) {
			return false;
		}
		Data other = (Data) obj;
		if (ano != other.ano) {
			return false;
		}
		if (dia != other.dia) {
			return false;
		}
		if (mes != other.mes) {
			return false;
		}
		return true;
	}
	

}