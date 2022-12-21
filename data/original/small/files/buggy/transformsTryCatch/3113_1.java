@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    try {
        android.util.Log.w("Event Listener", "loadHunt:onCancelled", databaseError.toException());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.widget.Toast.makeText(getActivity(), "Failed to retrieve hunt info.", Toast.LENGTH_SHORT).show();
}
