public static chevalierx.kiwapp.models.DAO.DAOBase getInstance(android.content.Context context) {
    try {
        if ((chevalierx.kiwapp.models.DAO.DAOBase.mInstance) == null) {
            chevalierx.kiwapp.models.DAO.DAOBase.mInstance = new chevalierx.kiwapp.models.DAO.DAOBase(context.getApplicationContext());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return chevalierx.kiwapp.models.DAO.DAOBase.mInstance;
}
