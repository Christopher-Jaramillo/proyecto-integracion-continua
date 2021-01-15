package ec.edu.epn;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdministradorTest {

    @Test
    public void obten_un_administrador_cuando_regitro_es_ok(){

        Administrador admin1 = new Administrador();
        assertEquals(true, admin1.registrarAdministrador("1725996365", "Billy Proaño", "El condado",
                "0983333483", "billy97proano@homail.com"));

    }

}