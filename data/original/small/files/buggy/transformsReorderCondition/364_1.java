@java.lang.Override
public void done(com.parse.ParseException e) {
    if (null != e)
        android.util.Log.d("Object saving error", e.toString());
    java.lang.System.out.println("Post updated");
}
