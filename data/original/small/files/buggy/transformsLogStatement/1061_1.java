@java.lang.Override
public java.lang.Object visitEnum(java.lang.Enum _enum) {
    System.out.println("log");
    if ((_enum.getOwner()) instanceof java.lang.Package) {
        eu.modelwriter.core.alloyinecore.typechecking.JavaSourceFromString javaSource = javaSourceGenerator.generateEnum(_enum);
    }
    return null;
}
