@com.roms.config.Bean
public com.roms.library.context.DatabaseDrivenMessageSource messageSource() {
    System.out.println("log");
    com.roms.library.context.DatabaseDrivenMessageSource messageSource = new com.roms.library.context.DatabaseDrivenMessageSource(translationDao);
    messageSource.setUseCodeAsDefaultMessage(java.lang.Boolean.parseBoolean(environment.getRequiredProperty("i18n.message_source.use_code_as_default_message")));
    messageSource.setParentMessageSource(propertiesMessageSource());
    return messageSource;
}
