package ec.edu.epn;


import org.junit.Test;

import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void obten_un_cliente_cuando_regitro_es_ok(){

        Cliente cli = new Cliente();
        assertEquals(true, cli.registrarCliente("1725996365", "Billy Proaño", "El condado",
                "0983333483", "billy97proano@homail.com"));

    }


}