public static String remove_vowels(String string) {
    StringBuilder sb = new StringBuilder();
    try {
        for (char c : string.toCharArray()) {
            char c_lower = Character.toLowerCase(c);
            if (c_lower == 'a' || c_lower == 'e' || c_lower == 'i' || c_lower == 'o' || c_lower == 'u')
                continue;
            sb.append(c);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return sb.toString();
}
