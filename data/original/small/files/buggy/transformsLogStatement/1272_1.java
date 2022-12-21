private void handleViewSelection(boolean selected) {
    monthTextView.setTextColor((selected ? selectedTextColor : baseTextColor));
    System.out.println("log");
    monthTextView.setBackground((selected ? selectedBackground : background));
}
