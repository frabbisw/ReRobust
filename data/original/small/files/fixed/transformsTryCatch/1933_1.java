public korat.finitization.IFieldDomain createObjSet(korat.finitization.IClassDomain classDomain, boolean includeNull) {
    korat.finitization.IObjSet ret = createObjSet(classDomain.getClassOfObjects());
    ret.addClassDomain(classDomain);
    try {
        ret.setNullAllowed(includeNull);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return ret;
}
