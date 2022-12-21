@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    try {
        userMessages.add(dataSnapshot.getValue(com.serhaturtis.getlocaty.models.MessageItem.class));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    fragmentMyMessages.rcAdapter.notifyDataSetChanged();
}
