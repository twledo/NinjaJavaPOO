public class Uchiha extends Ninja {
    private boolean sharingan;

    public Uchiha(String nomeNinja, int chakra, String jutsu, boolean sharingan) {
        super(nomeNinja, chakra, jutsu);
        this.sharingan = sharingan;
    }

    public boolean isSharingan() {
        return sharingan;
    }

    public void setSharingan(boolean sharingan) {
        this.sharingan = sharingan;
    }

    @Override
    public boolean usarJutsu() {
        if (this.getChakra() >= 10 && this.isSharingan()) { //True
            int novoChakra = this.getChakra() - 5;
            this.setChakra(novoChakra);
            System.out.println(this.getNomeNinja() + " usou o Sharingan e gastou metade do chakra para usar o jutsu " + getJutsu());
            System.out.println("--------------------------");
            return true;
        } else if (this.getChakra() >= 10) {
            System.out.println(this.getNomeNinja() + " usou o jutsu " + getJutsu() + " sem Sharingan");
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
        System.out.println("Sharingan: " + (isSharingan() ? "Tem" : "Não tem"));
        System.out.println("Chakra: " + this.getChakra());
        System.out.println("Jutsu: " + this.getJutsu());
        System.out.println("--------------------------");
    }
}
