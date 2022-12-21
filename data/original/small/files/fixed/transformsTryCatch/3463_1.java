@org.junit.Test
public void whenCheckingFitnessForNull_thenReturnNull() {
    org.corpus_tools.pepper.modules.PepperModule module = null;
    try {
        org.assertj.core.api.Assertions.assertThat(new org.corpus_tools.pepper.core.ModuleFitnessChecker().checkFitness(module)).isNull();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
