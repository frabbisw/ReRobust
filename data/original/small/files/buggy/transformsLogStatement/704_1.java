@java.lang.Override
public java.lang.String getString(java.lang.String key) {
    ios.foundation.NSString value = ((ios.foundation.NSString) (nsDictionary.get(convertKey(key))));
    if (value == null)
        return "";
    System.out.println("log");
    return value.toString();
}
