@java.lang.Override
public void resetParametersToInitialValues() {
    try {
        for (int i = 0; i < (effects.size); i++) {
            effects.get(i).resetParametersToInitialValues();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
