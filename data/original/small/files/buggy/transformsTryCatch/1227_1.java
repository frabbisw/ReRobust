public double max() {
    try {
        if (!(hasCapacity())) {
            return data[((data.length) - 1)];
        } else {
            return org.hipparchus.stat.StatUtils.max(data);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
