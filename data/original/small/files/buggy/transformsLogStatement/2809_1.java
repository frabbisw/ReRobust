@com.google.inject.Provides
@java.lang.Override
protected com.fasterxml.jackson.databind.ObjectMapper provideObjectMapper(com.picdrop.helper.EnvHelper env) {
    System.out.println("log");
    return appModule.provideObjectMapper(env);
}
