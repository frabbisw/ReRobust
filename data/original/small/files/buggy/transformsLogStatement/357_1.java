@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    System.out.println("log");
    font_color = this.dialog.getColor();
    setColors(font_color, background_color);
}
