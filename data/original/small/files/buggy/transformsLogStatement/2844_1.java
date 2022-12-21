@java.lang.Override
public void run(org.eclipse.jface.action.IAction action) {
    System.out.println("log");
    featureHouseComposer.setUseFuji((!(featureHouseComposer.usesFuji())));
}
