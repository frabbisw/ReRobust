@com.roms.config.Bean
public com.roms.library.context.DatabaseDrivenMessageSource messageSource() {
    com.roms.library.context.DatabaseDrivenMessageSource messageSource = new com.roms.library.context.DatabaseDrivenMessageSource(translationDao);
    try {
        messageSource.setUseCodeAsDefaultMessage(java.lang.Boolean.parseBoolean(environment.getRequiredProperty("i18n.message_source.use_code_as_default_message")));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    messageSource.setParentMessageSource(propertiesMessageSource());
    return messageSource;
}
