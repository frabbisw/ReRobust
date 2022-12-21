@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    clear_buttons();
    Button_LandHere.setSelected(true);
    try {
        set_selected_block(3, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
