@java.lang.Override
public boolean push(java.lang.String data) {
    try {
        if (!(isIn(data))) {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    AntiMessDao.Datenbank.add(data);
    return true;
}
