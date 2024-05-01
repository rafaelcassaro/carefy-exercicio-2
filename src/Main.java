import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MatrizAcoes acoes = new MatrizAcoes();
        ArrayList<Matriz> matrizes = new ArrayList<>();
        String key = "";
        Scanner sc = new Scanner(System.in);
        while (!key.equals("nao")) {
            Matriz matriz = new Matriz();
            matriz.criarMatriz();
            matrizes.add(matriz);

            System.out.println("Adicionar outra matriz? sim/nao\nObs: para terminar digite 'nao'");
            key = sc.nextLine();
        }
        sc.close();

        for (Matriz matriz : matrizes) {
            acoes.resolverCaminho(matriz.getColunaInicialX(), matriz.getLinhaInicialX(), matriz.getTamanhoCaminho(), matriz.getMatriz());
        }

    }
}