@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    try {
        if (dataSnapshot.exists())
            emitter.onSuccess(dataSnapshot);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    emitter.onComplete();
}
