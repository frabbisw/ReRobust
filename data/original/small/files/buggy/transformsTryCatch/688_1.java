public static void init(com.alex.code.foundation.App app) {
    try {
        com.alex.code.foundation.di.component.DaggerAppComponent.builder().create(app).inject(app);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
