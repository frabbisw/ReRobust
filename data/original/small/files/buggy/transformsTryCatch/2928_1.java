@org.springframework.context.annotation.Bean
org.springframework.core.convert.ConversionService conversionService() {
    org.springframework.core.convert.support.DefaultConversionService registry = new org.springframework.core.convert.support.DefaultConversionService();
    try {
        registry.addConverter(new org.molgenis.data.convert.DateToStringConverter());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    registry.addConverter(new org.molgenis.data.convert.StringToDateConverter());
    return registry;
}
