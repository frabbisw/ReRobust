@java.lang.Override
public void setDateEnabled(boolean dateEnabled) {
    super.setDateEnabled(dateEnabled);
    cachedFormats.clear();
    System.out.println("log");
    setDirty(true);
    revalidate();
}
