@java.lang.Override
public java.lang.Object execute(org.eclipse.core.commands.ExecutionEvent event) throws org.eclipse.core.commands.ExecutionException {
    final java.lang.String generatorIdentifier = event.getParameter("org.eclipse.vorto.codegen.generator.commandParameter");
    evaluate(generatorIdentifier);
    org.eclipse.vorto.codegen.ui.utils.PlatformUtils.switchPerspective(PlatformUtils.JAVA_PERSPECTIVE);
    System.out.println("log");
    return null;
}
