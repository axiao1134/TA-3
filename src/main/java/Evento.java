import java.util.ArrayList;
import java.util.List;

public class Evento {
	private String disciplina;
	private List<Equipo> equipos;  // Corregir el tipo de datos de equipos
	private String fecha;

	// Constructor que toma parámetros para inicializar el objeto
	public Evento(String disciplina, String fecha) {
		this.disciplina = disciplina;
		this.equipos = new ArrayList<>();  // Importa java.util.ArrayList para usar ArrayList
		this.fecha = fecha;
	}

	// Método para agregar un equipo al evento
	public void agregarEquipo(Equipo equipo) {
		equipos.add(equipo);
	}

	// Método para eliminar un equipo del evento
	public void eliminarEquipo(Equipo equipo) {
		equipos.remove(equipo);
	}

	// Método para mostrar la información del evento
	public String mostrarInformacion() {
		StringBuilder info = new StringBuilder();
		info.append("Disciplina: ").append(disciplina).append("\n");
		info.append("Fecha: ").append(fecha).append("\n");
		info.append("Equipos:\n");
		for (Equipo equipo : equipos) {
			info.append("- ").append(equipo.getNombre()).append("\n");
		}
		return info.toString();
	}

	public String getFecha() {
		return fecha;
	}
	public List<Equipo> getEquipos() {
		return equipos;
	}


}
