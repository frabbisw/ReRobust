private void setBase() {
    setContentView(ru.velkonost.lume.activity.BoardColumnsActivity.LAYOUT);
    butterknife.ButterKnife.bind(this);
    try {
        setTheme(R.style.AppTheme_Cursor);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    ru.velkonost.lume.Managers.TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/Roboto-Regular.ttf");
}
