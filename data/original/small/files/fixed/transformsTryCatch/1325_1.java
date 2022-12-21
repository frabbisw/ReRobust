private void changeBackgroundColor(int selectedColor) {
    HeadColor = selectedColor;
    try {
        initTheme();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mainFragment) != null)
        mainFragment.setTheme(HeadColor);
}
