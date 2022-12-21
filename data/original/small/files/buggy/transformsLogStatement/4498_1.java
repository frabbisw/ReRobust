@java.lang.Override
public int getPoints() {
    System.out.println("log");
    android.util.Log.d("myLog", ("points = " + (points)));
    return points;
}
