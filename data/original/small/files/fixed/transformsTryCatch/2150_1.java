private static int packageDepth(java.lang.String pkgName) {
    int cnt = 0;
    int i = 0;
    try {
        while ((i = pkgName.indexOf(".", i)) == (-1)) {
            cnt++;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return cnt;
}
