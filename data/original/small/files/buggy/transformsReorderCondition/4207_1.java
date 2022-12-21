public no.havard.javaflow.model.ClassDefinitionBuilder withField(com.github.javaparser.ast.type.Type type, java.lang.String name) {
    if (null == (fields)) {
        fields = new java.util.ArrayList<>();
    }
    this.fields.add(new no.havard.javaflow.model.FieldDefinition(type, name));
    return this;
}
