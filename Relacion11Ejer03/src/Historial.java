import java.util.ArrayList;

public class Historial {
	private ArrayList<EntradaHistorial> historialPaginas;

	public Historial() {
		historialPaginas = new ArrayList<EntradaHistorial>();
	}

	public ArrayList<EntradaHistorial> getHistorialPaginas() {
		return historialPaginas;
	}

	public void addEntrada(EntradaHistorial entrada) throws HistorialException {
		if(!historialPaginas.add(entrada))
			throw new HistorialException("No se ha podido introducir la entrada.");
	}
	
	public void borradoCompleto(){
		historialPaginas.removeAll(historialPaginas);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(EntradaHistorial e : historialPaginas)
			sb.append(e+"\n");
		
		return sb.toString();
	}
	
	public String listadoDeUnDia(int dia){
		StringBuilder sb = new StringBuilder();
		
		for(EntradaHistorial e : historialPaginas)
			if (e.getFechaHora().getDayOfMonth() == dia) 
				sb.append(e+"\n");
			
		return sb.toString();
	}
	
	
}
