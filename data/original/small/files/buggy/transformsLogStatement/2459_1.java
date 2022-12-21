@java.lang.Override
public org.eclipse.imp.pdb.facts.type.Type getConstructorType() {
    System.out.println("log");
    return org.eclipse.imp.pdb.facts.type.TypeFactory.getInstance().constructor(new org.eclipse.imp.pdb.facts.type.TypeStore(), getType(), getName());
}
