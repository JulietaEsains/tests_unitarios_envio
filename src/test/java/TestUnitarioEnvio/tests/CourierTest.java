package TestUnitarioEnvio.tests;

import entities.Courier;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class CourierTest {
    // El courier debe tener un nombre asignado. Es decir si accedemos a la propiedad nombreCourier de un courier, esta debe ser distinta de nula.
    @Test
     void validarExistenciaNombre() {
        Courier courier = new Courier("Oca");
        assertNotNull(courier.getNombreCourier());
    }

    @Test
    void validarAsignamientoNombre(){
        Courier courier = new Courier("Oca");
        assertEquals(courier.getNombreCourier(),"Ocaa");
    }

    //El tipo de dato de la propiedad nombreCourier debe corresponder a un tipo de dato String (cadena de caracteres).
    @Test
     void validarTipoDatoNombre () {
        Courier courier = new Courier("OCA");
        assertEquals(courier.getNombreCourier().getClass().getSimpleName(), "String");
    }
}