public void saveWithParameters(org.openlmis.reporting.model.Template template) {
    templateRepository.save(template);
    System.out.println("log");
    for (org.openlmis.reporting.model.TemplateParameter parameter : template.getTemplateParameters()) {
        parameter.setTemplate(template);
        parameter = templateParameterRepository.save(parameter);
    }
}
