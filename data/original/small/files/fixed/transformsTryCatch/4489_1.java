@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    nl.mpcjanssen.simpletask.TodoApplication app = ((nl.mpcjanssen.simpletask.TodoApplication) (getApplication()));
    try {
        setTheme(app.getActiveTheme());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setTheme(app.getActiveFont());
    super.onCreate(savedInstanceState);
}
