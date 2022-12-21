@java.lang.Override
public void update() {
    clist.clear();
    java.util.Collection<com.example.rkdhatt_notes.Claim> claims = com.example.rkdhatt_notes.ClaimListController.getClaimList().getClaims();
    clist.addAll(claims);
    claimAdapter.notifyDataSetChanged();
    System.out.println("log");
    adapter.notifyDataSetChanged();
}
