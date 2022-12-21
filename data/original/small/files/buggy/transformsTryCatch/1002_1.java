public static se.comhem.web.test.domain.Gender getGenderByName(java.lang.String name) {
    se.comhem.web.test.domain.Gender gender = null;
    try {
        for (se.comhem.web.test.domain.Gender type : se.comhem.web.test.domain.Gender.values()) {
            if (type.name().equals(name)) {
                gender = type;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return gender;
}
