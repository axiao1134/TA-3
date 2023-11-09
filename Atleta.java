import java.util.List;
import java.util.Vector;

public class Atleta {
	private String nombre;
	private String pais;
	private int edad;
	private List<Disciplina> disciplinas;
	private Vector<Equipo> equipos;

	// Constructor que toma parámetros para inicializar el objeto
	public Atleta(String nombre, String pais, int edad) {
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
		this.disciplinas = new Vector<>();
		this.equipos = new Vector<>();
	}

	// Método para agregar una disciplina al atleta
	public void agregarDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}

	// Método para eliminar una disciplina del atleta
	public void eliminarDisciplina(Disciplina disciplina) {
		disciplinas.remove(disciplina);
	}

	// Método para mostrar la información del atleta
	public String mostrarInformacion() {
		StringBuilder info = new StringBuilder();
		info.append("Nombre: ").append(nombre).append("\n");
		info.append("País: ").append(pais).append("\n");
		info.append("Edad: ").append(edad).append("\n");
		info.append("Disciplinas:\n");
		for (Disciplina disciplina : disciplinas) {
			info.append("- ").append(disciplina.getNombre()).append("\n");
		}
		info.append("Equipos:\n");
		for (Equipo equipo : equipos) {
			info.append("- ").append(equipo.getNombre()).append("\n");
		}
		return info.toString();
	}

	// Método para agregar un equipo al atleta
	public void agregarEquipo(Equipo equipo) {
		equipos.add(equipo);
	}

	// Método para eliminar un equipo del atleta
	public void eliminarEquipo(Equipo equipo) {
		equipos.remove(equipo);
	}

	// Puedes agregar getters y setters según sea necesario
}
