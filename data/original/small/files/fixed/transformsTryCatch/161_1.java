@java.lang.Override
public void setDateEnabled(boolean dateEnabled) {
    cachedFormats.clear();
    try {
        super.setDateEnabled(dateEnabled);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
