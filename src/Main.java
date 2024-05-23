//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GestorDeImpostos gestor = new GestorDeImpostos();

        Pessoa joao = new PessoaFisica("Joao", 45_000);
        Pessoa maria = new PessoaFisica("Maria", 180_000);

        PessoaJuridica barDoZe = new EmpresaSimples("Bar do ze", 250_000, 50_000);
        PessoaJuridica consultoria = new EmpresaSimples("Consultoria", 590_000, 190_000);

        gestor.adicionar(joao);
        gestor.adicionar(maria);
        gestor.adicionar(barDoZe);
        gestor.adicionar(consultoria);

        System.out.printf("Total de impostos: %.2f", gestor.getValorTotalImpostos());

    }
}