private void changeBackgroundColor(int selectedColor) {
    HeadColor = selectedColor;
    initTheme();
    if (null != (mainFragment))
        mainFragment.setTheme();
}
