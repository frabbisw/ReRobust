public static boolean has_close_elements(List<Double> numbers, double threshold) {
    for (int var = 0; var < numbers.size(); var += 1) {
        for (int j = var + 1; j < numbers.size(); j += 1) {
            double distance = numbers.get(var) - numbers.get(j);
            if (distance < threshold)
                return true;
        }
    }
    return false;
}
