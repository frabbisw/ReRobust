@java.lang.Override
public void addQuestion(java.lang.String questionText, java.lang.String questionType) {
    try {
        entity.getEntries().add(new pt.uc.dei.aor.project.persistence.entity.ScriptEntryEntity(questionText, questionType, entity.getNextPosition()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
