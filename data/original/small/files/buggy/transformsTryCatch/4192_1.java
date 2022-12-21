@java.lang.Override
public void setUserVisibleHint(boolean isVisibleToUser) {
    super.setUserVisibleHint(isVisibleToUser);
    try {
        if (isVisibleToUser) {
            com.rudie.severin.textadventure.DatabaseClasses.DBInterfacer helper = com.rudie.severin.textadventure.DatabaseClasses.DBInterfacer.getInstance(getActivity());
            helper.upgradeCharacterStat(1, PH.STRENGTH_ID);
            setText(charId);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
