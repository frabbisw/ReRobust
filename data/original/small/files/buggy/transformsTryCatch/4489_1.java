@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    nl.mpcjanssen.simpletask.TodoApplication app = ((nl.mpcjanssen.simpletask.TodoApplication) (getApplication()));
    setTheme(app.getActiveTheme());
    setTheme(app.getActiveFont());
    try {
        super.onCreate(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
