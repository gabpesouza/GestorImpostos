public class PessoaFisica extends Pessoa {

    public static final double RECEITA_ANUAL_ISENCAO = 50000;
    public static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    private double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    @Override
    protected double calcularImpostos() {

        double imposto = 0;

        if(!isIsentoImposto()) {
            imposto = getReceitaAnual() * ALIQUOTA_IMPOSTO_RENDA;
        }

        return imposto;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    private boolean isIsentoImposto() {
        return getReceitaAnual() <= RECEITA_ANUAL_ISENCAO;
    }
}
