@java.lang.Override
public void setAnotationTitle(java.lang.String title) {
    this.title = title;
    if (((getDefualtToolbar()) != null) || (title != null)) {
        getDefualtToolbar().setTitle(title.toString());
    }
}
