public abstract class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return nome;
    }

    protected abstract double calcularImpostos();
}
