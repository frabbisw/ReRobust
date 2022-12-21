protected void checkDocString(@org.jetbrains.annotations.NotNull com.jetbrains.python.inspections.PyDocStringOwner node) {
    try {
        for (com.jetbrains.python.inspections.PyInspectionExtension extension : com.intellij.openapi.extensions.Extensions.getExtensions(PyInspectionExtension.EP_NAME)) {
            if (extension.ignoreMissingDocstring(node)) {
                return;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
