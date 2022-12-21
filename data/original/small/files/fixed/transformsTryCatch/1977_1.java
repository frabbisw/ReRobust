@java.lang.Override
public void done(com.parse.ParseException e) {
    try {
        if (e == null) {
            gs.saveProfilePicToParse(prepareProfilePicForSaving());
        } else {
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
