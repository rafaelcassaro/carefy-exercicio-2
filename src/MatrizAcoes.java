public class MatrizAcoes {

    private int testeLinha;
    private int testeColuna;
    private int linhaAnterior;
    private int colunaAnterior;

    public void resolverCaminho(int colunaAtual, int linhaAtual, int tamanhoCaminho, int[][] matriz) {
        int rodadas = 0;
        StringBuilder rotaFinal = new StringBuilder();
        colunaAnterior = colunaAtual;
        linhaAnterior = linhaAtual;

        while (rodadas < tamanhoCaminho) {
            testeLinha = linhaAtual;
            testeColuna = colunaAtual;
            //TESTA SE A LINHA DE CIMA DA POSICAO ATUAL É VALIDA
            testeLinha--;
            if (linhaAtual > 0 && testeLinha != linhaAnterior && matriz[testeLinha][colunaAtual] == 0) {
                rotaFinal.append("F ");
                linhaAnterior = linhaAtual;
                linhaAtual = testeLinha;
                rodadas++;

            } else {     //TESTA SE A LINHA DE BAIXO DA POSICAO ATUAL É VALIDA
                testeLinha = linhaAtual;
                testeLinha++;
                if (linhaAtual < matriz.length && testeLinha != linhaAnterior && matriz[testeLinha][colunaAtual] == 0) {
                    rotaFinal.append("F ");
                    linhaAnterior = linhaAtual;
                    linhaAtual = testeLinha;
                    rodadas++;
                }
            }
            //TESTA SE A COLUNA DE CIMA DA POSICAO ATUAL É VALIDA
            testeColuna--;
            if (colunaAtual > 0 && testeColuna != colunaAnterior && matriz[linhaAtual][testeColuna] == 0) {
                rotaFinal.append("L ");
                colunaAnterior = colunaAtual;
                colunaAtual = testeColuna;
                rodadas++;

            } else {     //TESTA SE A COLUNA DE BAIXO DA POSICAO ATUAL É VALIDA
                if (rodadas == tamanhoCaminho) {
                    break;
                }
                testeColuna = colunaAtual;
                testeColuna++;
                if (colunaAtual < matriz[0].length && testeColuna != colunaAnterior && matriz[linhaAtual][testeColuna] == 0) {
                    rotaFinal.append("R ");
                    colunaAnterior = colunaAtual;
                    colunaAtual = testeColuna;
                    rodadas++;
                }
            }

        }
        System.out.println("Resultado");
        System.out.println(rotaFinal);
    }

}
