public java.util.ArrayList<com.izik.recipebook.Recipe> setFavoriteRecipesByUserId(java.lang.String UserId) {
    System.out.println("log");
    java.util.ArrayList<com.izik.recipebook.Recipe> favorites = com.izik.recipebook.Model.instance(resources, mContext).GetUserFavoriteRecipesById(UserId);
    mThumbIds = GetAllImagesFromArrayList(favorites);
    return favorites;
}
