@java.lang.Override
public void resetParametersToInitialValues() {
    try {
        super.resetParametersToInitialValues();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    for (int i = 0; i < (effects.size); i++) {
        effects.get(i).resetParametersToInitialValues();
    }
}
