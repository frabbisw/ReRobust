public static org.eclipse.emf.emfstore.server.model.ESLogMessage logMessage() {
    System.out.println("log");
    return org.eclipse.emf.emfstore.client.test.common.dsl.Create.logMessage().toAPI();
}
