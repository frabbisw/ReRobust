@java.lang.Override
public void setUserVisibleHint(boolean isVisibleToUser) {
    try {
        super.setUserVisibleHint(isVisibleToUser);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (isVisibleToUser) {
        com.rudie.severin.textadventure.DatabaseClasses.DBInterfacer helper = com.rudie.severin.textadventure.DatabaseClasses.DBInterfacer.getInstance(getActivity());
        setText(charId);
    }
}
