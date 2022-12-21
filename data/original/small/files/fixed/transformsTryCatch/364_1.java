@java.lang.Override
public void done(com.parse.ParseException e) {
    try {
        if (e != null)
            android.util.Log.d("Object saving error", e.toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
