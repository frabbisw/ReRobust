public void saveWithParameters(org.openlmis.reporting.model.Template template) {
    templateRepository.save(template);
    try {
        for (org.openlmis.reporting.model.TemplateParameter parameter : template.getTemplateParameters()) {
            parameter.setTemplate(template);
            parameter = templateParameterRepository.save(parameter);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
