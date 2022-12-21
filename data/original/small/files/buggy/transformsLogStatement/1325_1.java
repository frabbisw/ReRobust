private void changeBackgroundColor(int selectedColor) {
    HeadColor = selectedColor;
    initTheme();
    System.out.println("log");
    if ((mainFragment) != null)
        mainFragment.setTheme();
}
