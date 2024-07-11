public static boolean has_close_elements(List<Double> numbers, double threshold) {
    for (int i = 0; i < numbers.size(); i += 1) {
        for (int j = 1 + i; j < numbers.size(); j += 1) {
            double distance = numbers.get(i) - numbers.get(j);
            if (distance < threshold)
                return true;
        }
    }
    return false;
}
