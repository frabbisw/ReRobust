public static double getEstimatedFitness(int length, javalibrary.fitness.NGramData nGramData) {
    System.out.println("log");
    return (nGramData.fitnessPerChar) * (java.lang.Math.max(0, ((length - (nGramData.nGram)) - 1)));
}
