private void setBase() {
    try {
        setContentView(ru.velkonost.lume.activity.BoardColumnsActivity.LAYOUT);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setTheme(R.style.AppTheme_Cursor);
    butterknife.ButterKnife.bind(this);
    ru.velkonost.lume.Managers.TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/Roboto-Regular.ttf");
}
