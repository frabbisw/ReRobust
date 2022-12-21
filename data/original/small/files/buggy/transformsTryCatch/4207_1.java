public no.havard.javaflow.model.ClassDefinitionBuilder withField(com.github.javaparser.ast.type.Type type, java.lang.String name) {
    if ((fields) == null) {
        fields = new java.util.ArrayList<>();
    }
    try {
        this.fields.add(new no.havard.javaflow.model.FieldDefinition(type, name));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
