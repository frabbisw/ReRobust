@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        font_color = this.dialog.getColor();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setColors(font_color, background_color);
}
