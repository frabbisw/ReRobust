private void lastItem() {
    if (1 < (searchResult.length)) {
        resultCounter = (searchResult.length) - 1;
        displayResult(searchResult[resultCounter]);
    }
}
