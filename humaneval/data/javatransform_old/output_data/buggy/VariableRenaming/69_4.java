public static String decode_cyclic(String str) {
    class Cyclic {

        String encode_cyclic(String s) {
            ArrayList<String> groups = new ArrayList<String>();
            for (int var = 0; var < s.length(); var += 3) {
                groups.add(s.substring(var, Math.min(s.length(), var + 3)));
            }
            int remain = s.length() % 3;
            String result = "";
            for (String group : groups) {
                result += group.substring(1) + group.substring(0, 1);
            }
            if (remain > 0) {
                result += s.substring(s.length() - remain);
            }
            return result;
        }
    }
    final Cyclic cyclic = new Cyclic();
    return cyclic.encode_cyclic(cyclic.encode_cyclic(str));
}
