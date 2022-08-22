package movimentoCodar;
import desafio.Eventos;
public class Geral {

	public static void main(String[] args) {
		Eventos live = new Eventos();
		live.setNomeEvento("Live de boas vindas");
		
		System.out.println(live.getNomeEvento());
	}

}
