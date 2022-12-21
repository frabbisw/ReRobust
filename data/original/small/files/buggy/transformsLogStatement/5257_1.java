private void lastItem() {
    System.out.println("log");
    if ((searchResult.length) > 1) {
        resultCounter = (searchResult.length) - 1;
        displayResult(searchResult[resultCounter]);
    }
}
