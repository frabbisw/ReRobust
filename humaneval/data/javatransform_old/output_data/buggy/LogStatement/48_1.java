public static String anti_shuffle(String s) {
    String result = "";
    for (String str : s.split(" ")) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        result += new String(chars);
    }
    System.out.println("log");
    return result;
}
