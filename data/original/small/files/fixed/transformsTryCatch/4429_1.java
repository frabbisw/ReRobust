public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        deleteSchoolSubject(parent.getItemAtPosition(position).toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
