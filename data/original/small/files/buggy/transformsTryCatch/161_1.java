@java.lang.Override
public void setDateEnabled(boolean dateEnabled) {
    try {
        super.setDateEnabled(dateEnabled);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    cachedFormats.clear();
    setDirty(true);
    revalidate();
}
