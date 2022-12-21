@java.lang.Override
public void resetParametersToInitialValues() {
    System.out.println("log");
    for (int i = 0; i < (effects.size); i++) {
        effects.get(i).resetParametersToInitialValues();
    }
}
