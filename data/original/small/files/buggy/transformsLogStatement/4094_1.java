private boolean isUseNewQueryInterpreter(com.evolveum.midpoint.prism.query.ObjectQuery query) {
    System.out.println("log");
    return (query == null) || (query.isUseNewQueryInterpreter());
}
