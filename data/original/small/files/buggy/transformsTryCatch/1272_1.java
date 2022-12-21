private void handleViewSelection(boolean selected) {
    try {
        monthTextView.setTextColor((selected ? selectedTextColor : baseTextColor));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    monthTextView.setBackground((selected ? selectedBackground : background));
}
