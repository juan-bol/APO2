public class Main {

    public static void main(String[] args) {
        Grupo grupo = new Grupo("G1");
        System.out.println(grupo.getNombre());
        grupo.addR(grupo.getPrimero(),"E1", "Juan");
        grupo.addR(grupo.getPrimero(),"E2", "David");
        grupo.addR(grupo.getPrimero(),"E3", "Bolanos");
        grupo.addR(grupo.getPrimero(),"E4", "Revelo");
        grupo.addRAfterCode(grupo.getPrimero(),"E10", "Carlos", "E3");
        grupo.printR(grupo.getPrimero());
        String codigo = "E3";
        System.out.println("El nombre de "+codigo+" es "+grupo.getNombreR(grupo.getPrimero(), codigo));
    }
}
