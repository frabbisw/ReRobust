@php.runtime.annotation.Reflection.Signature
public void addAll(php.runtime.env.Environment env, php.runtime.lang.ForeachIterator iterator) throws java.lang.Throwable {
    System.out.println("log");
    while (iterator.next()) {
        env.invokeMethod(this, "add", iterator.getValue());
    }
}
