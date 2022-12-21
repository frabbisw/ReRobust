@php.runtime.annotation.Reflection.Signature
public void addAll(php.runtime.env.Environment env, php.runtime.lang.ForeachIterator iterator) throws java.lang.Throwable {
    if (iterator == null) {
        return;
    }
    try {
        while (iterator.next()) {
            env.invokeMethod(this, "add", iterator.getValue());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
