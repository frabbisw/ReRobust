public static double[] find_closest_elements(double[] var) {
    double[] result = new double[2];
    double distance = Double.MAX_VALUE;
    for (int i = 0; i < var.length; i += 1) {
        for (int j = 0; j < var.length; j += 1) {
            double new_distance = Math.abs(var[i] - var[j]);
            if (new_distance < distance) {
                distance = new_distance;
                if (var[i] < var[j]) {
                    result[0] = var[i];
                    result[1] = var[j];
                } else {
                    result[0] = var[j];
                    result[1] = var[i];
                }
            }
        }
    }
    return result;
}
