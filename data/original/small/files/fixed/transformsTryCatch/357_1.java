@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    background_color = this.dialog.getColor();
    try {
        setColors(font_color, background_color);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
