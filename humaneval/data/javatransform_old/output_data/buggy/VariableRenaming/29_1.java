public static boolean has_close_elements(List<Double> var, double threshold) {
    for (int i = 0; i < var.size(); i += 1) {
        for (int j = i + 1; j < var.size(); j += 1) {
            double distance = var.get(i) - var.get(j);
            if (distance < threshold)
                return true;
        }
    }
    return false;
}
