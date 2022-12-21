@java.lang.Override
public void onRestart() {
    System.out.println("log");
    super.onRestart();
    favView(eliasdowling.com.buoy.MainActivity.map);
    textView.setText("");
}
