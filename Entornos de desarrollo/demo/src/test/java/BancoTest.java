import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.contrasenia.Banco;


public class BancoTest {
    private Banco banco;
    @BeforeEach
    void setUp(){
        banco = new Banco();
        banco.depositar(1000);
    }
    
    @AfterEach
    void tearDown(){
        banco = null;
    }
    @Test
    void testSaldoInicial(){
        Assertions.assertEquals(1000, banco.getSaldo());
    }
    
    @Test
    void testDespositarFondos(){
        banco.depositar(500);
        Assertions.assertEquals(1500, banco.getSaldo());
    }
    @Test
    void testRetirarFondos(){
        banco.retirar(500);
        Assertions.assertEquals(500, banco.getSaldo());
    }
    
    @Test
    void testRetirarFondosInsuficientes(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> banco.retirar(2000));
    }
    @Test
    void testIngresarCantidadNegativa(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> banco.depositar(-200));
    }
}