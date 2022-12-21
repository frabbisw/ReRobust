@java.lang.Override
public void done(com.parse.ParseException e) {
    if (e != null)
        android.util.Log.d("Object saving error", e.toString());
    try {
        java.lang.System.out.println("Post updated");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
