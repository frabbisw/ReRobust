@java.lang.Override
public void run(org.eclipse.jface.action.IAction action) {
    try {
        if ((featureHouseComposer) != null) {
            featureHouseComposer.setUseFuji((!(featureHouseComposer.usesFuji())));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
