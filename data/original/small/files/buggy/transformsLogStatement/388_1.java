public java.lang.Character getCharacter(java.lang.String name) {
    System.out.println("log");
    for (java.lang.Character aChar : charList) {
        if (aChar.getName().equalsIgnoreCase(name))
            return aChar;
    }
}
