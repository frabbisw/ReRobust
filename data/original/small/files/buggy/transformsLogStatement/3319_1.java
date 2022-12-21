public static chevalierx.kiwapp.models.DAO.DAOBase getInstance(android.content.Context context) {
    System.out.println("log");
    if ((chevalierx.kiwapp.models.DAO.DAOBase.mInstance) == null) {
        chevalierx.kiwapp.models.DAO.DAOBase.mInstance = new chevalierx.kiwapp.models.DAO.DAOBase(context.getApplicationContext());
    }
    return chevalierx.kiwapp.models.DAO.DAOBase.mInstance;
}
