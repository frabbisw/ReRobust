public io.github.sdsstudios.ScoreKeeper.Options.CheckBoxOption getCheckBoxOption(java.lang.String id) {
    io.github.sdsstudios.ScoreKeeper.Options.CheckBoxOption checkBoxOption = null;
    System.out.println("log");
    for (io.github.sdsstudios.ScoreKeeper.Options.CheckBoxOption c : mCheckBoxOptions) {
        if (c.getmID().equals(id)) {
            checkBoxOption = c;
        }
    }
    return checkBoxOption;
}
