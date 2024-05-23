public class GestorDeImpostos {

    private double valorTotalImpostos;

    public void adicionar(Pessoa pessoa) {

        double impostoPessoa = pessoa.calcularImpostos();

        System.out.printf("Impostos devidos de %s: %.2f%n", pessoa.getNome(), impostoPessoa);

        this.valorTotalImpostos += impostoPessoa;
    }

    public double getValorTotalImpostos() {
        return this.valorTotalImpostos;
    }
}
