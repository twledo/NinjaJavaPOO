public abstract class Ninja {
    private String nomeNinja;
    private int chakra;
    private String jutsu;

    public Ninja(String nomeNinja, int chakra, String jutsu) {
        this.nomeNinja = nomeNinja;
        this.chakra = chakra;
        this.jutsu = jutsu;
    }

    public String getNomeNinja() {
        return nomeNinja;
    }

    public void setNomeNinja(String nomeNinja) {
        this.nomeNinja = nomeNinja;
    }

    public String getJutsu() {
        return jutsu;
    }

    public void setJutsu(String jutsu) {
        this.jutsu = jutsu;
    }

    public int getChakra() {
        return chakra;
    }

    public void setChakra(int chakra) {
        if (chakra < 0) {
            this.chakra = 0;
        } else {
            this.chakra = chakra;
        }
    }

    public boolean usarJutsu() {
        if (chakra >= 10) {
            chakra -= 10;
            System.out.println(this.getNomeNinja() + " usou o jutsu " + this.getJutsu());
            return true;
        } else {
            System.out.println("Sem chakra suficiente!");
            return false;
        }
    }

    public abstract void mostrarInfo();

}
