package pratica_get_set;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();

        p1.setNumConta(01);
        p1.setDono("jubileu");
        p1.abrirConta("CC");
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(02);
        p2.setDono("Maria");
        p2.abrirConta("CP");
        p2.sacar(50);
        p2.estadoAtual();

    }
}
