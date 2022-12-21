public void registrarConfusao(knn.Classe expected, knn.Classe actual) {
    try {
        (this.matriz[((knn.Classe.toInt(actual)) - 1)][((knn.Classe.toInt(expected)) - 1)])++;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
