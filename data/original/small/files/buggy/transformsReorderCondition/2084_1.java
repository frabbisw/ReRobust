@java.lang.Override
public void resetParametersToInitialValues() {
    for (int i = 0; (effects.size) > i; i++) {
        effects.get(i).resetParametersToInitialValues();
    }
}
