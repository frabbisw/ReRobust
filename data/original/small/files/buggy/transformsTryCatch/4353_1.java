@java.lang.Override
public void setDoubleAttribute(java.lang.String key, double value) {
    try {
        notSupportedOnClient();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
