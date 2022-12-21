private boolean isUseNewQueryInterpreter(com.evolveum.midpoint.prism.query.ObjectQuery query) {
    return (query.isUseNewQueryInterpreter()) || (query == null);
}
