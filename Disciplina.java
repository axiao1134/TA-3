import java.util.List;
import java.util.Vector;

public class Disciplina {
	private String nombre;
	private List<Atleta> participantes;  // Corregir el tipo de datos de participantes
	private String recordMundial;
	private Vector<Atleta> atletas = new Vector<>();
	private Vector<Equipo> equipos = new Vector<>();
	private Vector<Evento> eventos = new Vector<>();

	// Constructor que toma parámetros para inicializar el objeto
	public Disciplina(String nombre, String recordMundial) {
		this.nombre = nombre;
		this.participantes = new Vector<>();
		this.recordMundial = recordMundial;
	}

	// Método para mostrar la información de la disciplina
	public String mostrarInformacion() {
		StringBuilder info = new StringBuilder();
		info.append("Nombre: ").append(nombre).append("\n");
		info.append("Record Mundial: ").append(recordMundial).append("\n");
		info.append("Participantes:\n");
		for (Atleta atleta : atletas) {
			info.append("- ").append(atleta.getNombre()).append("\n");
		}
		info.append("Equipos:\n");
		for (Equipo equipo : equipos) {
			info.append("- ").append(equipo.getNombre()).append("\n");
		}
		info.append("Eventos:\n");
		for (Evento evento : eventos) {
			info.append("- ").append(evento.getFecha()).append("\n");
		}
		return info.toString();
	}

	// Método para agregar un atleta a la disciplina
	public void agregarAtleta(Atleta atleta) {
		atletas.add(atleta);
		participantes.add(atleta);  // Actualizar la lista de participantes
	}

	// Método para eliminar un atleta de la disciplina
	public void eliminarAtleta(Atleta atleta) {
		atletas.remove(atleta);
		participantes.remove(atleta);  // Actualizar la lista de participantes
	}

	// Puedes agregar getters y setters según sea necesario
}
