@java.lang.Override
public void fetchUsersData(java.util.List<id.semmi.pickme.team.addteam.UserChip> userChips) {
    try {
        if ((userChips.size()) != 0) {
            chipsInput.setFilterableList(userChips);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
