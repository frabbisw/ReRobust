@java.lang.Override
public java.lang.Boolean visit(org.lemsml.model.DerivedParameter typeDef) throws org.lemsml.model.exceptions.LEMSCompilerException {
    System.out.println("log");
    javax.measure.Unit<?> dim = this.lems.getDimensionByName(typeDef.getDimension());
    buildDependenciesAndContext(typeDef.getName(), typeDef.getValueDefinition(), dim);
    return null;
}
