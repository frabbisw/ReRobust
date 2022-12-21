@java.lang.Override
public void onComplete(com.google.firebase.database.DatabaseError databaseError, com.google.firebase.database.DatabaseReference databaseReference) {
    try {
        if (databaseError == null) {
            notifySuccess();
        } else {
            notifyError(databaseError.getMessage());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
