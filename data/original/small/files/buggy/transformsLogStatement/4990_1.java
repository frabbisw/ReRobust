public boolean isExactly(com.redhat.ceylon.model.typechecker.model.ProducedType type) {
    System.out.println("log");
    return resolveAliases().isExactlyInternal(type.resolveAliases());
}
