@java.lang.Override
public void onRestart() {
    try {
        super.onRestart();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    favView(eliasdowling.com.buoy.MainActivity.map);
    textView.setText("");
}
