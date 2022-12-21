@java.lang.Override
public int getPoints() {
    try {
        android.util.Log.d("myLog", ("points = " + (points)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return points;
}
