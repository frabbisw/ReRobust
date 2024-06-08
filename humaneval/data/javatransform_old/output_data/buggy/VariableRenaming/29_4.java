public static boolean has_close_elements(List<Double> numbers, double threshold) {
    for (int i = 0; i < numbers.size(); i += 1) {
        for (int var = i + 1; var < numbers.size(); var += 1) {
            double distance = numbers.get(i) - numbers.get(var);
            if (distance < threshold)
                return true;
        }
    }
    return false;
}
