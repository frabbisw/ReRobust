@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    try {
        android.util.Log.w("Event Listener", "loadHunt:onCancelled", databaseError.toException());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
