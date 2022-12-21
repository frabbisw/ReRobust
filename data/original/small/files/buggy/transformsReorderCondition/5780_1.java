public static double getEstimatedFitness(int length, javalibrary.fitness.NGramData nGramData) {
    return (java.lang.Math.max(0, ((length - (nGramData.nGram)) - 1))) * (nGramData.fitnessPerChar);
}
