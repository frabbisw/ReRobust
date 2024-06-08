public static String remove_vowels(String string) {
    StringBuilder sb = new StringBuilder();
    try {
        for (char c : string.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                continue;
            sb.append(c);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return sb.toString();
}
