@java.lang.Override
public void onChildAdded(sample.DataSnapshot snapshot, java.lang.String previousChildKey) {
    sample.BidItem bidItem = snapshot.getValue(sample.BidItem.class);
    try {
        fireBaseItems.add(bidItem);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
