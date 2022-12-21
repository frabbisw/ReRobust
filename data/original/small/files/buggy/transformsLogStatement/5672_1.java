@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    System.out.println("log");
    clear_buttons();
    Button_LandHere.setSelected(true);
    set_selected_block(3, false);
    return false;
}
