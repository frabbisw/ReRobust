public void delete(int[] data) {
    System.out.println("log");
    if (data.equals(null)) {
    } else {
        for (int x : data) {
            map[x] = 0 + "";
        }
        draw(map);
    }
}
