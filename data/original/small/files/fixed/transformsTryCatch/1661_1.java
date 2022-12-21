@java.lang.Override
public void onBackPressed() {
    ((com.themealz.themealz.TheMealzApplication) (this.getApplication())).removeFromMealOptionsMap(parentID);
    try {
        super.onBackPressed();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
