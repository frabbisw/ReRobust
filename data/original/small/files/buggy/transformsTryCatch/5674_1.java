public void bindEvent(edu.umd.cs.jobi.model.Event event) {
    this.event = event;
    try {
        dateTextView.setText(event.getDate().toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    typeTextView.setText(event.getType());
}
