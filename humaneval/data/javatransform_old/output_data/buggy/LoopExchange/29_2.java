public static boolean has_close_elements(List<Double> numbers, double threshold) {
    for (int i = 0; i < numbers.size(); i += 1) {
        {
            int j = i + 1;
            while (j < numbers.size()) {
                double distance = numbers.get(i) - numbers.get(j);
                if (distance < threshold)
                    return true;
                j += 1;
            }
        }
    }
    return false;
}
