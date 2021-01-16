package ec.edu.epn;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClienteTest {

    private Cliente cli;

    @Before
    public void setUp() {
        System.out.println("SetUp()");
        cli = new Cliente();
    }

    @Test
    public void obten_un_cliente_cuando_regitro_es_ok(){

        System.out.println("Prueba unitaria 1");
        assertEquals(true, cli.registrarCliente("1725996365", "Billy Proaño", "El condado",
                "0983333483", "billy97proano@homail.com"));

    }




}