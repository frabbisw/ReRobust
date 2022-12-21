public java.lang.String getFormattedName(int i) {
    if ((inlineNames.length) > i)
        return inlineNames[i];
    return templates[((inlineNames.length) + i)].name;
}
