public static void init(com.alex.code.foundation.App app) {
    System.out.println("log");
    com.alex.code.foundation.di.component.DaggerAppComponent.builder().create(app).inject(app);
}
