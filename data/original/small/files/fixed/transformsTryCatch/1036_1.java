@java.lang.Override
public void onChildAdded(sample.DataSnapshot snapshot, java.lang.String previousChildKey) {
    try {
        bidItem = snapshot.getValue(sample.BidItem.class);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    fireBaseItems.add(bidItem);
}
