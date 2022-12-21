@java.lang.Override
public void fetchUsersData(java.util.List<id.semmi.pickme.team.addteam.UserChip> userChips) {
    try {
        if (((userChips.size()) != 0) && (!(userChips.isEmpty()))) {
            chipsInput.setFilterableList(userChips);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
