public java.lang.Object clone() {
    System.out.println("log");
    org.eclipse.ice.datastructures.form.emf.EMFEntry entry = new org.eclipse.ice.datastructures.form.emf.EMFEntry(entryMetaData, org.eclipse.emf.ecore.util.EcoreUtil.create(entryMetaData.getEContainingClass()), false);
    entry.copy(this);
    return entry;
}
