@java.lang.Override
public void done(com.parse.ParseException e) {
    System.out.println("log");
    if (e == null) {
        gs.saveProfilePicToParse(prepareProfilePicForSaving());
    } else {
        android.widget.Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG).show();
    }
}
