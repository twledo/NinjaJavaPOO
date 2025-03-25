public class Uzumaki extends Ninja{
    private boolean biju;

    public Uzumaki(String nomeNinja, int chakra, String jutsu, boolean biju) {
        super(nomeNinja, chakra, jutsu);
        this.biju = biju;
    }

    public boolean isBiju() {
        return biju;
    }

    public void setBiju(boolean biju) {
        this.biju = biju;
    }

    public boolean usarJutsu() {
        if (this.getChakra() >= 10 && this.isBiju()) { //True
            int novoChakra;
            novoChakra = this.getChakra() + 10;
            this.setChakra(novoChakra);
            System.out.println(this.getNomeNinja() + " usou a Biju e ganhou 20 de chakra para poder usar o jutsu " + getJutsu());
            System.out.println("--------------------------");
            return true;
        } else if (this.getChakra() >= 10) {
            System.out.println(this.getNomeNinja() + " usou o jutsu " + getJutsu() + " sem Biju");
            System.out.println("--------------------------");
            return false;
        } else {
            System.out.println(this.getNomeNinja() + "não tem Chakra suficiente!");
            System.out.println("--------------------------");
            return false;
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + this.getNomeNinja());
        System.out.println("Biju: " + (isBiju() ? "Tem" : "Não tem"));
        System.out.println("Chakra: " + this.getChakra());
        System.out.println("Jutsu: " + this.getJutsu());
        System.out.println("--------------------------");
    }
}
