package Ex3_3;

public class Pet {
    private final String nome;
    private boolean isClean = false;

    public Pet(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }
}
