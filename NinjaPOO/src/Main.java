public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 150, "Chidori", true);
        sasuke.mostrarInfo();
        sasuke.usarJutsu();
        sasuke.mostrarInfo();
        sasuke.recarregarChakra(20);
        sasuke.mostrarInfo();

//        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", 150, "Rasengan", true);
//        naruto.mostrarInfo();
//        naruto.usarJutsu();
//        naruto.mostrarInfo();
    }
}