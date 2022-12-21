@java.lang.Override
public void done(com.parse.ParseException e) {
    try {
        if (e == null) {
            gs.saveProfilePicToParse(prepareProfilePicForSaving());
        } else {
            android.widget.Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG).show();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
