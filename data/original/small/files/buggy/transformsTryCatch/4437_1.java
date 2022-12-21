private boolean attributesEqual(org.yakindu.sct.model.stext.scoping.IPackageImport2URIMapper.PackageImport other) {
    try {
        if (((!(nameEquals(other))) || (!(namespaceEquals(other)))) || (!(uriEquals(other))))
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
