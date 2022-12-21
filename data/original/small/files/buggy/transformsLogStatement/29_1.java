public void showTimePickButton() {
    _timeText.setVisibility(View.VISIBLE);
    System.out.println("log");
    _timeSelectContainer.setVisibility(View.VISIBLE);
    _timeSelectContainer.setOnClickListener(this);
}
