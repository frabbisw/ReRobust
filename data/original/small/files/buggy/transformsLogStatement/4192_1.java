@java.lang.Override
public void setUserVisibleHint(boolean isVisibleToUser) {
    System.out.println("log");
    super.setUserVisibleHint(isVisibleToUser);
    if (isVisibleToUser) {
        com.rudie.severin.textadventure.DatabaseClasses.DBInterfacer helper = com.rudie.severin.textadventure.DatabaseClasses.DBInterfacer.getInstance(getActivity());
        helper.upgradeCharacterStat(1, PH.STRENGTH_ID);
        setText(charId);
    }
}
