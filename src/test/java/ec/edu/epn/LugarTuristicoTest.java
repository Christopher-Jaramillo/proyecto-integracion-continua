package ec.edu.epn;

import org.junit.Test;

import java.sql.Array;

import static org.junit.Assert.*;

public class LugarTuristicoTest {

    @Test
    public void obten_lugarTuristico_cuando_lugar_es_ok(){

        String [] medidas = {"bioseguridad", "distanciamiento", "aforo limite de personas"};
        LugarTuristico lugar = new LugarTuristico();
        assertEquals(true, lugar.registrarLugarTuristico("Salinas",
                                                                    "Playa",
                                                                "24 Horas",
                                                                "Domingo a Domingo",
                                                                "Manabi",
                                                                (float) 4.8,
                                                                medidas,
                                                                "Una de las mejores playas que he visitado"));
    }



}