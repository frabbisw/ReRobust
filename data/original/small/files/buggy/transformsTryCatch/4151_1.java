@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot2) {
    try {
        for (com.google.firebase.database.DataSnapshot postSnapshot2 : dataSnapshot2.getChildren()) {
            troutenamelist.add(postSnapshot2.child("Route Name").getValue().toString());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
