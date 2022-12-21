public void saveWithParameters(org.openlmis.reporting.model.Template template) {
    try {
        templateRepository.save(template);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    for (org.openlmis.reporting.model.TemplateParameter parameter : template.getTemplateParameters()) {
        parameter.setTemplate(template);
        templateParameterRepository.save(parameter);
    }
}