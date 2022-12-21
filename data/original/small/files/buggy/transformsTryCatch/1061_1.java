@java.lang.Override
public java.lang.Object visitEnum(java.lang.Enum _enum) {
    try {
        if ((_enum.getOwner()) instanceof java.lang.Package) {
            eu.modelwriter.core.alloyinecore.typechecking.JavaSourceFromString javaSource = javaSourceGenerator.generateEnum(_enum);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
