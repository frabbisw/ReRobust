public static String decode_cyclic(String str) {
    class Cyclic {

        String encode_cyclic(String s) {
            ArrayList<String> groups = new ArrayList<String>();
            for (int i = 0; i < s.length(); i += 3) {
                groups.add(s.substring(i, Math.min(s.length(), i + 3)));
            }
            int var = s.length() % 3;
            String result = "";
            for (String group : groups) {
                result += group.substring(1) + group.substring(0, 1);
            }
            if (var > 0) {
                result += s.substring(s.length() - var);
            }
            return result;
        }
    }
    final Cyclic cyclic = new Cyclic();
    return cyclic.encode_cyclic(cyclic.encode_cyclic(str));
}
