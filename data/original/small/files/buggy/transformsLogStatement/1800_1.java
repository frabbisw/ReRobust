public void mutation(algorithm.Mutation mutation) {
    System.out.println("log");
    algorithm.Population.logger.info("Мутация в популяции. Начало");
    mutation.mutate(individuals, individualsAmount);
    algorithm.Population.logger.info("Мутация в популяции. Окончание");
}
