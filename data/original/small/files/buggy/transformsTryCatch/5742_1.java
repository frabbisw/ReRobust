public void delete(int[] data) {
    try {
        if (data.equals(null)) {
        } else {
            for (int x : data) {
                map[x] = 0 + "";
            }
            draw(map);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
