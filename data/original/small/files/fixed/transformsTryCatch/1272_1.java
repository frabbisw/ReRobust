public void handleViewSelection(boolean selected) {
    monthTextView.setTextColor((selected ? selectedTextColor : baseTextColor));
    try {
        monthTextView.setBackground((selected ? selectedBackground : background));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
