@java.lang.Override
@io.vertx.codegen.annotations.Nullable
public java.lang.String subtag(int level) {
    ensureHeaderProcessed();
    if ((parsedValues.length) > level) {
        return parsedValues[level];
    }
    return null;
}
