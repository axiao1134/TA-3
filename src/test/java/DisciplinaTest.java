import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DisciplinaTest {

    private Disciplina disciplina;

    @Before
    public void setUp() {
        // Crear una nueva Disciplina para cada prueba
        disciplina = new Disciplina("Natación", "Record Natación");
    }

    @Test
    public void agregarAtleta() {
        // Crear un atleta de prueba
        Atleta atleta = new Atleta("Carlos", "Brasil", 28);

        // Agregar el atleta a la disciplina
        disciplina.agregarAtleta(atleta);

        // Verificar que el atleta se haya agregado correctamente
        assertTrue(disciplina.getAtletas().contains(atleta));
        assertTrue(disciplina.getParticipantes().contains(atleta));
    }

    @Test
    public void eliminarAtleta() {
        // Crear un atleta de prueba
        Atleta atleta = new Atleta("Ana", "España", 24);

        // Agregar el atleta a la disciplina
        disciplina.agregarAtleta(atleta);

        // Eliminar el atleta de la disciplina
        disciplina.eliminarAtleta(atleta);

        // Verificar que el atleta se haya eliminado correctamente
        assertFalse(disciplina.getAtletas().contains(atleta));
        assertFalse(disciplina.getParticipantes().contains(atleta));
    }

    // Puedes continuar con pruebas para los demás métodos según tus necesidades.
}
