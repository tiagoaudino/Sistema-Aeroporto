import java.util.ArrayList;

public class ControleVoos {

    private ArrayList<Voo> voos;


    public ControleVoos() {
        voos = new ArrayList<>();
    }


    public boolean cadastrarVoo(Voo voo) {

        if (buscarVoo(voo.getCodigo()) != null) {
            return false;
        }

        voos.add(voo);
        return true;
    }


    public Voo buscarVoo(int codigo) {

        for (int i=0;i<voos.size();i++) {

            if (voos.get(i).getCodigo() == codigo) {
                return voos.get(i);
            }
        }

        return null;
    }


    public void listarVoos() {

        for (int i=0;i<voos.size();i++) {
            System.out.println(voos.get(i));
        }
    }

    public void listarAutorizados() {

        for (int i=0;i<voos.size();i++) {

            Autorizacao autorizacao = (Autorizacao) voos.get(i);

            if (autorizacao.autorizacaoDecolagem()==true) {
                System.out.println(voos.get(i));
            }
        }
    }

    public void listarPendentes() {

        for (int i=0;i<voos.size();i++) {

            Autorizacao autorizacao = (Autorizacao) voos.get(i);

            if (autorizacao.autorizacaoDecolagem()!=true) {
                System.out.println(voos.get(i));
            }
        }
    }
    public double calcularCustoTotal() {

        double total = 0;
        for (int i=0;i<voos.size();i++) {

            voos.get(i).calculoValorFinal();
            total += voos.get(i).getValor();
        }

        return total;
    }

    public Voo vooMaisCaro() {

        if (voos.isEmpty()) {
            return null;
        }

        Voo maisCaro = voos.get(0);
        maisCaro.calculoValorFinal();

        for (int i=0;i<voos.size();i++) {

            voos.get(i).calculoValorFinal();

            if (voos.get(i).getValor() > maisCaro.getValor()) {
                maisCaro = voos.get(i);
            }
        }

        return maisCaro;
    }

    public int quantidadeVoos() {
        return voos.size();
    }
}