@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    com.CMPUT301W15T02.teamtoapp.Model.Claim claim = adapter.getItem(position);
    try {
        claimListController.removeClaim(claim);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mSelectedItems.size()) > 0) {
        setUpFilteredAdapter();
    }
}