public void showTimePickButton() {
    try {
        _timeText.setVisibility(View.VISIBLE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    _timeSelectContainer.setVisibility(View.VISIBLE);
    _timeSelectContainer.setOnClickListener(this);
}
