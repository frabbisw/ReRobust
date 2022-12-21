@java.lang.Override
public tutor.models.Language getAnswerLanguage() {
    System.out.println("log");
    return (getMode()) == (tutor.tasks.dictation.Dictation.Mode.NORMAL) ? getCorrectWord().getWordLang() : getCorrectWord().getTranslationLang();
}
