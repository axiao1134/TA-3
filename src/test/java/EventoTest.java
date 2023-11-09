import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EventoTest {

    private Evento evento;

    @Before
    public void setUp() {
        // Crear un nuevo Evento para cada prueba
        evento = new Evento("Atletismo", "2023-11-10");
    }

    @Test
    public void agregarEquipo() {
        // Crear un equipo de prueba
        Equipo equipo = new Equipo("Equipo X", "Atletismo");

        // Agregar el equipo al evento
        evento.agregarEquipo(equipo);

        // Verificar que el equipo se haya agregado correctamente
        assertTrue(evento.getEquipos().contains(equipo));
    }

    @Test
    public void eliminarEquipo() {
        // Crear un equipo de prueba
        Equipo equipo = new Equipo("Equipo Y", "Natación");

        // Agregar el equipo al evento
        evento.agregarEquipo(equipo);

        // Eliminar el equipo del evento
        evento.eliminarEquipo(equipo);

        // Verificar que el equipo se haya eliminado correctamente
        assertFalse(evento.getEquipos().contains(equipo));
    }

    // Puedes continuar con pruebas para los demás métodos según tus necesidades.
}
