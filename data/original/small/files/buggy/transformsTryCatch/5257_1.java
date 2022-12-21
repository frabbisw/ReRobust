private void lastItem() {
    try {
        if ((searchResult.length) > 1) {
            resultCounter = (searchResult.length) - 1;
            displayResult(searchResult[resultCounter]);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
