@java.lang.Override
protected boolean shouldAcceptContainer(@com.drew.lang.annotations.NotNull com.drew.metadata.mov.atoms.Atom atom) {
    return (atom.type.equals(QtContainerTypes.ATOM_METADATA_LIST)) || (QtMetadataDirectory._tagIntegerMap.containsKey(atom));
}
