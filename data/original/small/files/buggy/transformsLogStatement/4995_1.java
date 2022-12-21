@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    userMessages.add(dataSnapshot.getValue(com.serhaturtis.getlocaty.models.MessageItem.class));
    System.out.println("log");
    fragmentMyMessages.rcAdapter.notifyDataSetChanged();
}
