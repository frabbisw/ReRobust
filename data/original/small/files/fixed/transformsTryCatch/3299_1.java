public void create(java.lang.String name, java.lang.String mode) {
    com.getknowledge.modules.dictionaries.programming.languages.ProgrammingLanguage programmingLanguage = new com.getknowledge.modules.dictionaries.programming.languages.ProgrammingLanguage();
    try {
        programmingLanguage.setName(name);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    programmingLanguage.setMode(mode);
    create(programmingLanguage);
}
