public void setSavedPageCheckComplete(boolean complete) {
    savedPageCheckComplete = complete;
    try {
        if (!(isAdded())) {
            return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    getActivity().supportInvalidateOptionsMenu();
}
