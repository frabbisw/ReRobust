@java.lang.Override
public void run(java.lang.String[] args) throws java.io.IOException {
    mindbadger.footballresults.loader.apps.ImportDataFromJSONToDB app = new mindbadger.footballresults.loader.apps.ImportDataFromJSONToDB();
    try {
        app.readFile();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
