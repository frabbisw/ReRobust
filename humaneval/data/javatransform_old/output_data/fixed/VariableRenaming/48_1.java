public static String anti_shuffle(String var) {
    String result = "";
    for (String str : var.split(" ")) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        result += new String(chars) + " ";
    }
    return result.substring(0, result.length() - 1);
}
