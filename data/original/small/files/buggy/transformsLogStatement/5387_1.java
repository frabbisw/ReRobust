@java.lang.Override
public void run(java.lang.String[] args) throws java.io.IOException {
    System.out.println("log");
    mindbadger.footballresults.loader.apps.ImportDataFromJSONToDB app = new mindbadger.footballresults.loader.apps.ImportDataFromJSONToDB();
    app.readFile();
}
