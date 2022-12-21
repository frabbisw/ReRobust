@org.junit.Test
public void whenCheckingFitnessForNull_thenReturnNull() {
    org.corpus_tools.pepper.modules.PepperModule module = null;
    System.out.println("log");
    org.assertj.core.api.Assertions.assertThat(new org.corpus_tools.pepper.core.ModuleFitnessChecker(null).checkFitness(module)).isNull();
}
