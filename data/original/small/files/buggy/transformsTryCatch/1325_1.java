private void changeBackgroundColor(int selectedColor) {
    HeadColor = selectedColor;
    initTheme();
    try {
        if ((mainFragment) != null)
            mainFragment.setTheme();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
