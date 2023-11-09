import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EquipoTest {

    private Equipo equipo;

    @Before
    public void setUp() {
        // Crear un nuevo Equipo para cada prueba
        equipo = new Equipo("Equipo A", "Baloncesto");
    }

    @Test
    public void agregarAtleta() {
        // Crear un atleta de prueba
        Atleta atleta = new Atleta("Carlos", "Argentina", 30);

        // Agregar el atleta al equipo
        equipo.agregarAtleta(atleta);

        // Verificar que el atleta se haya agregado correctamente
        assertTrue(equipo.getAtletas().contains(atleta));
    }

    @Test
    public void eliminarAtleta() {
        // Crear un atleta de prueba
        Atleta atleta = new Atleta("Ana", "España", 25);

        // Agregar el atleta al equipo
        equipo.agregarAtleta(atleta);

        // Eliminar el atleta del equipo
        equipo.eliminarAtleta(atleta);

        // Verificar que el atleta se haya eliminado correctamente
        assertFalse(equipo.getAtletas().contains(atleta));
    }

    // Puedes continuar con pruebas para los demás métodos según tus necesidades.
}
