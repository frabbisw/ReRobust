public java.util.ArrayList<com.izik.recipebook.Recipe> setFavoriteRecipesByUserId(java.lang.String UserId) {
    java.util.ArrayList<com.izik.recipebook.Recipe> favorites = com.izik.recipebook.Model.instance(mContext).GetUserFavoriteRecipesById(UserId);
    try {
        mThumbIds = GetAllImagesFromArrayList(favorites);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return favorites;
}
