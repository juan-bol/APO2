package test;

import junit.framework.TestCase;
import model.Carro;
import model.CarroException;
import model.Consecionario;

public class ConsecionarioTest extends TestCase {

    private Consecionario con;

    public void setupEscenario1() throws CarroException {
        con = new Consecionario();
        con.agregarCarro("A","A","A",4, 40000);
        con.agregarCarro("B","B","B",4, 32000);
        con.agregarCarro("C","C","C",6, 59200);

    }

    public void setupEscenario2(){
        con = new Consecionario();
    }

    public void testAgregarCarro1(){
        try{
            setupEscenario1();
            assertEquals(con.getCarros().get("A").getMarca(), "A");
            assertEquals(con.getCarros().get("B").getColor(), "B");
            assertEquals(con.getCarros().get("C").getNumAsientos(), 6);
        } catch (CarroException exception){
            System.out.println(exception.getMessage());
        }

    }

    // Se espera que esta pruebe falle, descomentar para verificar
//    public void testAgregarCarro2Fail(){
//        setupEscenario1();
//        assertEquals(con.getCarros().get("A").getMarca(), "B");
//        assertEquals(con.getCarros().get("B").getColor(), "C");
//        assertEquals(con.getCarros().get("C").getNumAsientos(), 4);
//    }

    public void testAgregarCarroException(){
        setupEscenario2();
        try {
            con.agregarCarro("   ", "A", "A", 4, 40000);
            fail();
        } catch (CarroException exception){
            assertEquals(con.getCarros().size(),0);
        }

    }

    public void testContarCarros1(){
        setupEscenario2();
        assertEquals(con.getCarros().size(),0);
    }
    public void testContarCarros2(){
        try {
            setupEscenario1();
            assertEquals(con.getCarros().size(),3);
        } catch (CarroException exception){
            System.out.println(exception.getMessage());
        }
    }

    public void testEliminarCarro1(){
        try{
            setupEscenario1();
            assertNotNull(con.eliminarCarro("A"));
        } catch (CarroException exception){
            System.out.println(exception.getMessage());
        }

    }
    public void testEliminarCarro2(){
        setupEscenario2();
        assertNull(con.eliminarCarro("Z"));
    }

    // TODO
//    public void testCalcularValorPromedio(){
//        try {
//            setupEscenario1();
//            assertEquals(con.calcularValorPromedio(), 43733);
//        } catch (CarroException exception){
//            System.out.println(exception.getMessage());
//        }
//    }

    // TODO
//    public void testAlgunaPlacaEmpiezaConLetra(){
//        try {
//            setupEscenario1();
//            assertTrue(con.algunaPlacaEmpiezaConLetra('A'));
//        } catch (CarroException exception){
//            System.out.println(exception.getMessage());
//        }
//    }




}
