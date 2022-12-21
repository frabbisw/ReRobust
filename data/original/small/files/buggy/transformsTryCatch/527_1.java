public static void main(java.lang.String[] args) {
    java.lang.String fileString = "countries.txt";
    try {
        CountriesTextFile.createFile(fileString);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    CountriesApp.selectMenuOption();
    CountriesApp.continueProgram();
}
