public class Main {

    public static void main(String[] args) {
        Grupo grupo = new Grupo("G1");
        System.out.println(grupo.getNombre());
        grupo.add("E1", "Juan");
        grupo.add("E2", "David");
        grupo.add("E3", "Bolanos");
        grupo.print();
        String codigo = "E3";
        System.out.println("El nombre de "+codigo+" es "+grupo.getNombre(grupo.getPrimero(), codigo));
    }
}
