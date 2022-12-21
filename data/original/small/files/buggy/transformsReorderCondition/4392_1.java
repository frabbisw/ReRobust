@java.lang.Override
public void fetchUsersData(java.util.List<id.semmi.pickme.team.addteam.UserChip> userChips) {
    if (0 != (userChips.size())) {
        chipsInput.setFilterableList(userChips);
    }
}
