public io.github.sdsstudios.ScoreKeeper.Options.CheckBoxOption getCheckBoxOption(java.lang.String id) {
    io.github.sdsstudios.ScoreKeeper.Options.CheckBoxOption checkBoxOption = null;
    try {
        for (io.github.sdsstudios.ScoreKeeper.Options.CheckBoxOption c : mCheckBoxOptions) {
            if (c.getmID().equals(id)) {
                checkBoxOption = c;
                break;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return checkBoxOption;
}
