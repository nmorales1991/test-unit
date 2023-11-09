import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void suma() {
        int total = Main.suma(1, 3);
        assertEquals(4, total);
    }

    @Test
    void resta() {
        int total = Main.resta(5, 3);
        assertEquals(2, total);
    }

    @Test
    void mensaje() {
        String mensaje = Main.mensaje(30);
        assertEquals("El total es: 30", mensaje);
    }

}