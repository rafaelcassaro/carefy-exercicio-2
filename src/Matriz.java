import java.util.Scanner;

public class Matriz {

    private int[][] matriz;
    private int tamanhoCaminho = -1;

    private int linhaInicialX = 0;
    private int colunaInicialX = 0;

    public int[][] getMatriz() {
        return matriz;
    }

    public int getTamanhoCaminho() {
        return tamanhoCaminho;
    }

    public int getLinhaInicialX() {
        return linhaInicialX;
    }

    public int getColunaInicialX() {
        return colunaInicialX;
    }

    int linhas;
    int colunas;

    public void criarMatriz() {
        Scanner sc = new Scanner(System.in);

        int correto = 0;
        while(correto != 1){
            System.out.println("Digite a linha e coluna que tenha um tamanho entre 2<=x<=100 ex: 2 3: ");
            String input = sc.nextLine();

            linhas = Integer.parseInt(String.valueOf(input.charAt(0)));
            colunas = Integer.parseInt(String.valueOf(input.charAt(input.length() - 1)));

            if(linhas <2 || linhas >100){
                System.out.println("VALOR INVALIDO !!\n");
            } else if (colunas <2 || colunas >100) {
                System.out.println("VALOR INVALIDO !!\n");
            }else {
                correto = 1;
            }
        }

        matriz = new int[linhas][colunas];
        addLinhasEColunas();
        quantidadePassos();

    }
    //QNTD DE PASSOS PARA CONCLUSAO DA MATRIZ
    protected void quantidadePassos() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] == 0) {
                    tamanhoCaminho++;
                }
            }
        }
    }
    //ADICIONAR OS VALORES DAS LINHAS E COLUNAS DA NOVA MATRIZ
    protected void addLinhasEColunas() {
        Scanner sc = new Scanner(System.in);
        int contadorEspacos;
        for (int i = 0; i < linhas; i++) {
            contadorEspacos = 0;
            System.out.println("Digite os valores da linha " + i);
            String x = sc.nextLine();
            for (int j = 0; j < colunas; j++) {
                if (x.charAt(contadorEspacos) == 'X' || x.charAt(contadorEspacos) == 'x') {
                    linhaInicialX = i;
                    colunaInicialX = j;
                } else {
                    matriz[i][j] = Integer.parseInt(String.valueOf(x.charAt(contadorEspacos)));
                }
                contadorEspacos += 2;

            }
        }

    }


}
