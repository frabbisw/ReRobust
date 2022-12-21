@java.lang.Override
public java.lang.Boolean visit(org.lemsml.model.DerivedParameter typeDef) throws org.lemsml.model.exceptions.LEMSCompilerException {
    javax.measure.Unit<?> dim = this.lems.getDimensionByName(typeDef.getDimension());
    try {
        buildDependenciesAndContext(typeDef, dim);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
