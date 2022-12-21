public void mutation(algorithm.Mutation mutation) {
    algorithm.Population.logger.info("Мутация в популяции. Начало");
    mutation.mutate(individuals);
    try {
        algorithm.Population.logger.info("Мутация в популяции. Окончание");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
