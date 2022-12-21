public java.lang.Character getCharacter(java.lang.String name) {
    try {
        for (java.lang.Character aChar : charList) {
            if (aChar.getName().equalsIgnoreCase(name))
                return aChar;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
