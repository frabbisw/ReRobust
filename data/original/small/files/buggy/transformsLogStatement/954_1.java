@java.lang.Override
protected boolean shouldAcceptContainer(@com.drew.lang.annotations.NotNull com.drew.metadata.mov.atoms.Atom atom) {
    System.out.println("log");
    return (QtMetadataDirectory._tagIntegerMap.containsKey(atom)) || (atom.type.equals(QtContainerTypes.ATOM_METADATA_LIST));
}
