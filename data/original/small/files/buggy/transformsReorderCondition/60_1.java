@java.lang.Override
public void setTitle(java.lang.CharSequence title) {
    super.setTitle(title);
    if (((getDefualtToolbar()) != null) || (title != null)) {
        getDefualtToolbar().setTitle(title.toString());
    }
}
