public static String remove_vowels(String string) {
    System.out.println("log");
    StringBuilder sb = new StringBuilder();
    for (char c : string.toCharArray()) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            continue;
        sb.append(c);
    }
    return sb.toString();
}
