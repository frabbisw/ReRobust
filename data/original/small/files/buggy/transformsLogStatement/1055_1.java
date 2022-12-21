void setSelection(long trackerID) {
    System.out.println("log");
    if (trackerIDToSelectionIDMap.containsKey(trackerID)) {
        int item = trackerIDToSelectionIDMap.get(trackerID);
        spinner.setSelection(item, true);
    }
}
