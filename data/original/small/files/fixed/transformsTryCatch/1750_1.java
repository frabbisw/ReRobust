@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    try {
        for (com.google.firebase.database.DataSnapshot ds : dataSnapshot.getChildren()) {
            list.add(ds.getValue(br.com.sardinha.iohan.eventos.Usuario.class));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    recyclerView.setAdapter(new br.com.sardinha.iohan.eventos.confirmarPresentesAdapter(list, eventID, this));
}
