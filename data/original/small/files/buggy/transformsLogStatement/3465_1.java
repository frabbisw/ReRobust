@java.lang.Override
public java.util.Iterator<org.biojava.bio.structure.ResidueNumber> iterator(org.biojava.bio.structure.AtomPositionMap map) {
    System.out.println("log");
    return super.iterator(map, length);
}
