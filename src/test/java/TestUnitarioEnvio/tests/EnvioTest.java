package TestUnitarioEnvio.tests;

import entities.Courier;
import entities.Envio;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

//Esta es la clase EnvíoTest
@SpringBootTest
public class EnvioTest {
    //El envío debe tener un número de seguimiento. Es decir si accedemos a la propiedad numeroSeguimiento de un envío, esta debe ser distinta de nula.
    @Test
    void validarExistenciaNumeroSeguimiento(){
        Envio envio = new Envio(4545,25005,new Date());
        assertNotNull(envio.getNumeroSeguimiento());
    }


    //El tipo de dato de la propiedad numeroSeguimiento de un envío debe corresponder a un int (número entero).
    @Test
    void validarTipoDatoNumeroSeguimiento(){
       Envio envio = new Envio(4545,25005,new Date( ));
       assertEquals(envio.getNumeroSeguimiento().getClass().getSimpleName(),"Integer");
    }

    //El envío debe tener un ID_Venta asignado. Es decir si accedemos a la propiedad ID_Venta de un envío, esta debe ser distinta de nula.
    @Test
    void validarExistenciaID_Venta(){
        Envio envio = new Envio(4545,25005,new Date());
        assertNotNull(envio.getID_Venta());

    }
    //El tipo de dato de la propiedad ID_Venta de un envío debe corresponder a un tipo de dato int (número entero).
    @Test
    void validarTipoDatoID_Venta () {
        Envio envio = new Envio(4545,25005,new Date( ));
        assertEquals(envio.getID_Venta().getClass().getSimpleName(),"Integer");
    }

    //El envío debe tener una fecha de creación. Es decir si accedemos a la propiedad fechaCreacion de un envío, esta debe ser distinta de nula.
    @Test
    void validarExistenciaFechaCreacion(){
        Envio envio = new Envio(4545,25005,new Date());
        assertNotNull(envio.getFechaCreacion());
    }

    // El tipo de dato de la propiedad fechaCreacion de un envío debe corresponder a Date (fecha y hora)
    @Test
    void validarTipoDatoFechaCreacion() {
        Envio envio = new Envio(4545,25005,new Date( ));
        assertEquals(envio.getFechaCreacion().getClass().getSimpleName(),"Date");
    }

}
