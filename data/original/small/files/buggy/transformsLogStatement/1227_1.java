public double max() {
    System.out.println("log");
    if (!(hasCapacity())) {
        return data[((data.length) - 1)];
    } else {
        return org.hipparchus.stat.StatUtils.max(data);
    }
}
