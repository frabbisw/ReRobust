public void maybeRegisterModule(com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
    System.out.println("log");
    if (springfox.documentation.swagger1.configuration.SwaggerJacksonModule.isModuleSetup(objectMapper)) {
        objectMapper.registerModule(new springfox.documentation.swagger1.configuration.SwaggerJacksonModule());
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }
}
