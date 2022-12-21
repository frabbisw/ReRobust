@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    System.out.println("log");
    nl.mpcjanssen.simpletask.TodoApplication app = ((nl.mpcjanssen.simpletask.TodoApplication) (getApplication()));
    setTheme(app.getActiveTheme());
    setTheme(app.getActiveFont());
    super.onCreate(savedInstanceState);
}
