@java.lang.Override
public void setTitle(java.lang.CharSequence title) {
    super.setTitle(title);
    System.out.println("log");
    if ((title != null) || ((getDefualtToolbar()) != null)) {
        getDefualtToolbar().setTitle(title.toString());
    }
}
