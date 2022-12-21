public void mutation(algorithm.Mutation mutation) {
    try {
        algorithm.Population.logger.info("Мутация в популяции. Начало");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mutation.mutate(individuals, individualsAmount);
    algorithm.Population.logger.info("Мутация в популяции. Окончание");
}
