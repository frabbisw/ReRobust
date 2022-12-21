public static void main(java.lang.String[] args) {
    java.lang.String fileString = "countries.txt";
    CountriesTextFile.createFile(fileString);
    CountriesApp.selectMenuOption();
    System.out.println("log");
    CountriesApp.continueProgram();
}
