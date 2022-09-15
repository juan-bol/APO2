package test;

import junit.framework.TestCase;
import model.Carro;
import model.Consecionario;

public class ConsecionarioTest extends TestCase {

    private Consecionario con;

    public void setupEscenario1(){
        con = new Consecionario();
        con.agregarCarro("A","A","A",4, 40000);
        con.agregarCarro("B","B","B",4, 32000);
        con.agregarCarro("C","C","C",6, 59200);

    }

    public void setupEscenario2(){
        con = new Consecionario();
    }

    public void testAgregarCarro1(){
        setupEscenario1();
        assertEquals(con.getCarros().get("A").getMarca(), "A");
        assertEquals(con.getCarros().get("B").getColor(), "B");
        assertEquals(con.getCarros().get("C").getNumAsientos(), 6);
    }

//    public void testAgregarCarro2Fail(){
//        setupEscenario1();
//        assertEquals(con.getCarros().get("A").getMarca(), "B");
//        assertEquals(con.getCarros().get("B").getColor(), "C");
//        assertEquals(con.getCarros().get("C").getNumAsientos(), 4);
//    }

    public void testContarCarros1(){
        setupEscenario2();
        assertEquals(con.getCarros().size(),0);
    }
    public void testContarCarros2(){
        setupEscenario1();
        assertEquals(con.getCarros().size(),3);
    }

    public void testEliminarCarro1(){
        setupEscenario1();
        assertNotNull(con.eliminarCarro("A"));
    }
    public void testEliminarCarro2(){
        setupEscenario2();
        assertNull(con.eliminarCarro("Z"));
    }

    public void testCalcularValorPromedio(){
        setupEscenario1();
        assertEquals(con.calcularValorPromedio(),43733);
    }

    public void testAlgunaPlacaEmpiezaConLetra(){
        setupEscenario1();
        assertTrue(con.algunaPlacaEmpiezaConLetra('A'));
    }




}
