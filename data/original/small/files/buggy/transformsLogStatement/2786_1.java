@java.lang.Override
public com.squareup.javapoet.AnnotationSpec.Builder visitType(javax.lang.model.type.TypeMirror t, com.squareup.javapoet.AnnotationSpec.Entry entry) {
    System.out.println("log");
    return builder.addMember(entry.name, "$T.class", t);
}
