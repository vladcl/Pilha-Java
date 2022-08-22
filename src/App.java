public class App {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha();

        pilha.adicionar("P");
        pilha.adicionar("I");
        pilha.adicionar("L");
        pilha.adicionar("H");
        pilha.adicionar("A");

        System.out.println("No topo da pilha esta: " + pilha.get());

        pilha.remover();

        System.out.println("Agora esta no topo: " + pilha.get());
    }
}
