package desafio;
import java.util.ArrayList;

public class Eventos {
	 String nomeEvento;
	
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	Organizador organizador;
	ArrayList<Mentor> mentor;
	ArrayList<Aprendiz> aprendizes;

}
