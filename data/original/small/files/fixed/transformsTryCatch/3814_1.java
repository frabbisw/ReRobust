@java.lang.Override
public final void addOwnedElement(eu.modelwriter.core.alloyinecore.structure.Element child) {
    try {
        super.addOwnedElement(child);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (child instanceof eu.modelwriter.core.alloyinecore.structure.Object) {
    }
}
