void setSelection(long trackerID) {
    try {
        if (trackerIDToSelectionIDMap.containsKey(trackerID)) {
            int item = trackerIDToSelectionIDMap.get(trackerID);
            spinner.setSelection(item);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
