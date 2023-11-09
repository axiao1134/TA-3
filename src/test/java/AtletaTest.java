import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AtletaTest {

    private Atleta atleta;

    @Before
    public void setUp() {
        // Crear un nuevo Atleta para cada prueba
        atleta = new Atleta("Juan", "Argentina", 25);
    }

    @Test
    public void agregarDisciplina() {
        // Crear una disciplina de prueba
        Disciplina disciplina = new Disciplina("Natación", "Record Natación");

        // Agregar la disciplina al Atleta
        atleta.agregarDisciplina(disciplina);

        // Verificar que la disciplina se haya agregado correctamente
        assertTrue(atleta.getDisciplinas().contains(disciplina));
    }

    @Test
    public void eliminarDisciplina() {
        // Crear una disciplina de prueba
        Disciplina disciplina = new Disciplina("Ciclismo", "Record Ciclismo");

        // Agregar la disciplina al Atleta
        atleta.agregarDisciplina(disciplina);

        // Eliminar la disciplina del Atleta
        atleta.eliminarDisciplina(disciplina);

        // Verificar que la disciplina se haya eliminado correctamente
        assertFalse(atleta.getDisciplinas().contains(disciplina));
    }

    @Test
    public void agregarEquipo() {
        // Crear un equipo de prueba
        Equipo equipo = new Equipo("Team A", "Baloncesto");

        // Agregar el equipo al Atleta
        atleta.agregarEquipo(equipo);

        // Verificar que el equipo se haya agregado correctamente
        assertTrue(atleta.getEquipos().contains(equipo));
    }

    @Test
    public void eliminarEquipo() {
        // Crear un equipo de prueba
        Equipo equipo = new Equipo("Team B", "Voleibol");

        // Agregar el equipo al Atleta
        atleta.agregarEquipo(equipo);

        // Eliminar el equipo del Atleta
        atleta.eliminarEquipo(equipo);

        // Verificar que el equipo se haya eliminado correctamente
        assertFalse(atleta.getEquipos().contains(equipo));
    }
}
