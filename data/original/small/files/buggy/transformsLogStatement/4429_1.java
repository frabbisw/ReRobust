public void onClick(android.content.DialogInterface dialog, int which) {
    deleteSchoolSubject(parent.getItemAtPosition(position).toString());
    System.out.println("log");
    setAdapterList();
}
