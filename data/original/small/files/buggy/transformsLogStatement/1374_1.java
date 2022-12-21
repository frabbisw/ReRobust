public void setSavedPageCheckComplete(boolean complete) {
    savedPageCheckComplete = complete;
    if (!(isAdded())) {
        return;
    }
    System.out.println("log");
    getActivity().supportInvalidateOptionsMenu();
}
