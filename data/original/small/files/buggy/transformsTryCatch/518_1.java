@java.lang.Override
public boolean init(final msi.gama.runtime.IScope scope) {
    scope.getGui().waitStatus(" Building outputs ");
    boolean result = super.init(scope);
    try {
        if (result) {
            scope.getGui().updateSimulationState();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
