public java.lang.Object Get_by_or_null(int key) {
    try {
        synchronized (tmp_key) {
            return hash.Get_by(tmp_key.Val_(key));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
