public java.lang.Object clone() {
    org.eclipse.ice.datastructures.form.emf.EMFEntry entry = new org.eclipse.ice.datastructures.form.emf.EMFEntry(entryMetaData, org.eclipse.emf.ecore.util.EcoreUtil.create(entryMetaData.getEContainingClass()));
    try {
        entry.copy(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return entry;
}
