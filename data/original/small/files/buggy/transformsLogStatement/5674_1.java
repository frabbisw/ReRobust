public void bindEvent(edu.umd.cs.jobi.model.Event event) {
    System.out.println("log");
    this.event = event;
    dateTextView.setText(event.getDate().toString());
    typeTextView.setText(event.getType());
}
