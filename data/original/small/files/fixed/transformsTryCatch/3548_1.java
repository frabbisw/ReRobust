@com.roms.config.Bean
public com.roms.library.context.DatabaseDrivenMessageSource messageSource() {
    com.roms.library.context.DatabaseDrivenMessageSource messageSource = new com.roms.library.context.DatabaseDrivenMessageSource(translationDao);
    try {
        messageSource.setParentMessageSource(propertiesMessageSource());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return messageSource;
}
