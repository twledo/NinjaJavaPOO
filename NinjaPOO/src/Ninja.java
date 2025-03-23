public class Ninja {
    String nomeNinja;
    int chakra;
    String jutsu;

    public void usarJutsu() {
        chakra -= 10;
        System.out.println(nomeNinja + " usou " + jutsu);
        System.out.println("--------------------------");
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nomeNinja);
        System.out.println("Chakra: " + chakra);
        System.out.println("Jutsu: " + jutsu);
        System.out.println("--------------------------");
    }
}
