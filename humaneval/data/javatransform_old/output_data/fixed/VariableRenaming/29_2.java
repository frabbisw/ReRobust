public static boolean has_close_elements(List<Double> numbers, double var) {
    for (int i = 0; i < numbers.size(); i += 1) {
        for (int j = i + 1; j < numbers.size(); j += 1) {
            double distance = Math.abs(numbers.get(i) - numbers.get(j));
            if (distance < var)
                return true;
        }
    }
    return false;
}
