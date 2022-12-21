@java.lang.Override
public void setAnotationTitle(java.lang.String title) {
    this.title = title;
    try {
        if ((title != null) || ((getDefualtToolbar()) != null)) {
            getDefualtToolbar().setTitle(title.toString());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
