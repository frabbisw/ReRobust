public static void increaseIndex() {
    (comunicationStrings.index)++;
    if (255 < (comunicationStrings.index))
        comunicationStrings.index = 0;
}
