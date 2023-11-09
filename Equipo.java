import java.util.List;
import java.util.Vector;

public class Equipo {
	private String nombre;
	private List<Atleta> atletas;  // Corregir el tipo de datos de atletas
	private String disciplina;
	private Vector<Evento> eventos = new Vector<>();

	// Constructor que toma parámetros para inicializar el objeto
	public Equipo(String nombre, String disciplina) {
		this.nombre = nombre;
		this.atletas = new Vector<>();
		this.disciplina = disciplina;
	}

	// Método para agregar un atleta al equipo
	public void agregarAtleta(Atleta atleta) {
		atletas.add(atleta);
	}

	// Método para eliminar un atleta del equipo
	public void eliminarAtleta(Atleta atleta) {
		atletas.remove(atleta);
	}

	// Método para mostrar la información del equipo
	public String mostrarInformacion() {
		StringBuilder info = new StringBuilder();
		info.append("Nombre: ").append(nombre).append("\n");
		info.append("Disciplina: ").append(disciplina).append("\n");
		info.append("Atletas:\n");
		for (Atleta atleta : atletas) {
			info.append("- ").append(atleta.getNombre()).append("\n");
		}
		info.append("Eventos:\n");
		for (Evento evento : eventos) {
			info.append("- ").append(evento.getFecha()).append("\n");
		}
		return info.toString();
	}

	// Puedes agregar getters y setters según sea necesario
}
