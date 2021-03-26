import static org.junit.jupiter.api.Assertions.*;

public class TestCal {

    private Calculadora calC =new Calculadora();

    @org.junit.jupiter.api.Test

    void tSuma(){
        assertEquals(20,calC.suma(10,10));
        assertEquals(1590,calC.suma(1000,590));
    }
    @org.junit.jupiter.api.Test
    void tResta(){
        assertEquals(10,calC.resta(10,0));
        assertEquals(700,calC.resta(1000,300));
    }
    @org.junit.jupiter.api.Test
    void tMultiplicacion(){
        assertEquals(0,calC.multiplicacion(5,0));
        assertEquals(18,calC.multiplicacion(6,3));
    }
    @org.junit.jupiter.api.Test
    void tDivision(){
        assertEquals(30,calC.division(60,2));
        assertEquals(11.25,calC.division(900,80));
    }
    @org.junit.jupiter.api.Test
    void tRaiz(){
        assertEquals(3,calC.raiz(2,9));
        assertEquals(3,calC.raiz(3,27));
    }
}
