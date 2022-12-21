@java.lang.Override
public void done(com.parse.ParseException e) {
    System.out.println("log");
    if (e != null)
        android.util.Log.d("Object saving error", e.toString());
    java.lang.System.out.println("Post updated");
}
