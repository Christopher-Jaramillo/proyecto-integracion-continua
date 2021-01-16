package ec.edu.epn;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class LugarTuristicoInterfaceTest {

    @Test
    public void given_result_of_search(){
        LugarTuristicoInterface l = Mockito.mock(LugarTuristicoInterface.class);
        Mockito.when(l.busquedalugarTuristico("Carolina")).thenReturn("Estos son los resultados");
        assertEquals(l.busquedalugarTuristico("Carolina"),"Lugar no encontrado");
    }
}