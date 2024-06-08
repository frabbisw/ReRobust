public static boolean check_dict_case(HashMap<Object, Object> dict) {
    if (dict.size() == 0)
        return false;
    else {
        String var = "start";
        for (Object key : dict.keySet()) {
            if (!(key instanceof String)) {
                var = "mixed";
                break;
            }
            String str_key = (String) key;
            if (var.equals("start")) {
                if (str_key.toUpperCase().equals(str_key))
                    var = "upper";
                else if (str_key.toLowerCase().equals(str_key))
                    var = "lower";
                else {
                    var = "mixed";
                    break;
                }
            } else if ((var.equals("upper") && !str_key.toUpperCase().equals(str_key)) || (var.equals("lower") && !str_key.toLowerCase().equals(str_key))) {
                var = "mixed";
                break;
            }
        }
        return (var.equals("upper")) || (var.equals("lower"));
    }
}
