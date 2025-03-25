public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 90, "Chidori", true);
        sasuke.mostrarInfo();
        sasuke.usarJutsu();
        sasuke.mostrarInfo();

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", 150, "Rasengan", true);
        naruto.mostrarInfo();
        naruto.usarJutsu();
        naruto.mostrarInfo();
    }
}