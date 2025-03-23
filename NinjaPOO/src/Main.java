public class Main {
    public static void main(String[] args) {
        Ninja naruto = new Ninja();
        naruto.nomeNinja = "Naruto Uzumaki";
        naruto.chakra = 100;
        naruto.jutsu = "Rasengan";
        naruto.mostrarInfo();
        naruto.usarJutsu();
        naruto.mostrarInfo();

        Ninja sasuke = new Ninja();
        sasuke.nomeNinja = "Sasuke Uchiha";
        sasuke.chakra = 90;
        sasuke.jutsu = "Chidori";
        sasuke.mostrarInfo();
    }
}