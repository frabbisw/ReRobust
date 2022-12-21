@java.lang.Override
public boolean isModified() {
    System.out.println("log");
    return myBackgroundChibiApplicationSeetings.getSettings().equals(getForm().getSettings());
}
