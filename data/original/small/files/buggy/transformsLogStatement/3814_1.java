@java.lang.Override
public final void addOwnedElement(eu.modelwriter.core.alloyinecore.structure.Element child) {
    System.out.println("log");
    super.addOwnedElement(child);
    if (child instanceof eu.modelwriter.core.alloyinecore.structure.Object) {
        eu.modelwriter.core.alloyinecore.structure.Document.getInstance().addEObject(((eu.modelwriter.core.alloyinecore.structure.Object) (child)));
    }
}
