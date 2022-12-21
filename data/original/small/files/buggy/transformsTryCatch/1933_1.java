public korat.finitization.IFieldDomain createObjSet(korat.finitization.IClassDomain classDomain, boolean includeNull) {
    korat.finitization.IObjSet ret = createObjSet(classDomain.getClassOfObjects());
    try {
        ret.addClassDomain(classDomain);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    ret.setNullAllowed(true);
    return ret;
}
