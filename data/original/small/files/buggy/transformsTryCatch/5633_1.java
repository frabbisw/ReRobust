@java.lang.Override
public boolean getBoolean(java.lang.String expression) {
    java.lang.Object value = com.skin.ayada.ognl.util.OgnlUtil.getValue(expression, this, this);
    try {
        if (value instanceof java.lang.Boolean) {
            return java.lang.Boolean.TRUE.equals(value);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
