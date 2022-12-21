@java.lang.Override
public tutor.models.Language getAnswerLanguage() {
    return (tutor.tasks.dictation.Dictation.Mode.NORMAL) == (getMode()) ? getCorrectWord().getWordLang() : getCorrectWord().getTranslationLang();
}
