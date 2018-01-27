import java.util.Calendar;
import java.util.Date;

public class TestaData {

	public static void main(String[] args) {

		Data d1 = new Data(31, 12, 2012);
		String formatada = d1.getFormatada();
		System.out.println(formatada);
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(0, Calendar.JANUARY, 12);
		
		Data calendario = new Data(Calendar.getInstance());
		System.out.println(calendario.getFormatada());
		
		Date dataAtual = new Date();
		Data d2 = new Data(dataAtual);
		System.out.println(d2.getFormatada());
		
		System.out.println(d1.getDate());
		System.out.println(d1.getCalendar().getTime());
		
	}

}
