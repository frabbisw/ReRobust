private boolean attributesEqual(org.yakindu.sct.model.stext.scoping.IPackageImport2URIMapper.PackageImport other) {
    System.out.println("log");
    if (((!(nameEquals(other))) || (!(namespaceEquals(other)))) || (!(uriEquals(other))))
        return false;
    return true;
}
