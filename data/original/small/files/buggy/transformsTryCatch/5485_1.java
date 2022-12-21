@java.lang.Override
public java.lang.String validateValue(java.lang.String value) {
    java.lang.String newValue = null;
    try {
        if (value != null) {
            newValue = value.trim();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return newValue;
}
