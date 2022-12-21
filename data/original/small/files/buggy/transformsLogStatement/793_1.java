public void registrarConfusao(knn.Classe expected, knn.Classe actual) {
    System.out.println("log");
    (this.matriz[((knn.Classe.toInt(actual)) - 1)][((knn.Classe.toInt(expected)) - 1)])++;
}
