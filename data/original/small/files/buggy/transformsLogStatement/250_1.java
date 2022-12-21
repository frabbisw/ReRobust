@java.lang.Override
public void start() {
    System.out.println("log");
    java.util.List<net.abstractfactory.plum.interaction.rich.field.RichField> inputs = createInteractiveFields();
    try {
        java.lang.Object result = invokeMethod(null);
    } catch (java.lang.Exception e) {
        onError(e);
    }
}
