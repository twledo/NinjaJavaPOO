public abstract class Ninja {
    private String nomeNinja;
    private int chakra;
    private String jutsu;
    private int chakraMax;

    public Ninja(String nomeNinja, int chakra, String jutsu) {
        this.nomeNinja = nomeNinja;
        this.chakra = chakra;
        this.jutsu = jutsu;
        this.chakraMax = chakra;
    }

    public int getChakraMax() {
        return chakraMax;
    }

    public void setChakraMax(int chakraMax) {
        this.chakraMax = chakraMax;
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

    public void recarregarChakra(int recarregarC) {
        setChakra(this.chakra + recarregarC);
        if (getChakra() > getChakraMax()) {
            setChakra(this.chakraMax);
            System.out.println("Chakra no limite permitido");
            System.out.println("--------------------------");
        } else {
            System.out.println("Chakra recarregado com sucesso");
            System.out.println("--------------------------");
        }
    }
}