public class Main {

    public static void main(String[] args) {

        ControleVoos controle = new ControleVoos();

        Voo nacional1 = new VooNacional(1, "Porto Alegre", "Sao Paulo", 1000, 500, true, 100, 180);
        Voo nacional2 = new VooNacional(2, "Porto Alegre", "Curitiba", 700, 50, true, 5, 180);

        Voo internacional1 = new VooInternacional(3, "Porto Alegre", "Buenos Aires", 900, 500, true, 120, 200, true);
        Voo internacional2 = new VooInternacional(4, "Porto Alegre", "Montevideo", 800, 500, true, 10, 200, true);

        Voo carga1 = new VooCarga(5, "Porto Alegre", "Sao Paulo", 1000, 500, true, 2000, 5000, true);
        Voo carga2 = new VooCarga(6, "Porto Alegre", "Rio de Janeiro", 1500, 500, true, 6000, 5000, true);

        nacional1.calculoCombustivel();
        nacional2.calculoCombustivel();
        internacional1.calculoCombustivel();
        internacional2.calculoCombustivel();
        carga1.calculoCombustivel();
        carga2.calculoCombustivel();

        controle.cadastrarVoo(nacional1);
        controle.cadastrarVoo(nacional2);
        controle.cadastrarVoo(internacional1);
        controle.cadastrarVoo(internacional2);
        controle.cadastrarVoo(carga1);
        controle.cadastrarVoo(carga2);

        System.out.println("Todos os voos:");
        controle.listarVoos();

        System.out.println("\nVoos autorizados:");
        controle.listarAutorizados();

        System.out.println("\nVoos pendentes:");
        controle.listarPendentes();

        System.out.println("\nCusto total: R$ " + controle.calcularCustoTotal());

        System.out.println("\nVoo mais caro:");
        System.out.println(controle.vooMaisCaro());

        System.out.println("\nQuantidade de voos: " + controle.quantidadeVoos());

        System.out.println("\nBusca pelo codigo 3:");
        System.out.println(controle.buscarVoo(3));

        if (!controle.cadastrarVoo(nacional1)) {
            System.out.println("\nCodigo de voo ja cadastrado!");
        }
    }
}