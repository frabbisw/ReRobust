public void newCameraOpen(android.view.View view) {
    try {
        android.widget.Toast.makeText(this, "NewCamera", Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.content.Intent intent = new android.content.Intent(this, cs321.classcamapp.CameraActivity2.class);
    startActivity(intent);
}
