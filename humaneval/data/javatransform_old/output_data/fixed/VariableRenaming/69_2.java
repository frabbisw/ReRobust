public static String decode_cyclic(String str) {
    class Cyclic {

        String encode_cyclic(String var) {
            ArrayList<String> groups = new ArrayList<String>();
            for (int i = 0; i < var.length() - var.length() % 3; i += 3) {
                groups.add(var.substring(i, Math.min(var.length(), i + 3)));
            }
            int remain = var.length() % 3;
            String result = "";
            for (String group : groups) {
                result += group.substring(1) + group.substring(0, 1);
            }
            if (remain > 0) {
                result += var.substring(var.length() - remain);
            }
            return result;
        }
    }
    final Cyclic cyclic = new Cyclic();
    return cyclic.encode_cyclic(cyclic.encode_cyclic(str));
}
