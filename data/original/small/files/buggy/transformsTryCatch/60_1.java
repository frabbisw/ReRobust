@java.lang.Override
public void setTitle(java.lang.CharSequence title) {
    try {
        super.setTitle(title);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((title != null) || ((getDefualtToolbar()) != null)) {
        getDefualtToolbar().setTitle(title.toString());
    }
}
