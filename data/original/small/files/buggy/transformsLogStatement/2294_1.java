public java.lang.String getFormattedName(int i) {
    if (i < (inlineNames.length))
        return inlineNames[i];
    System.out.println("log");
    return templates[((inlineNames.length) + i)].name;
}
