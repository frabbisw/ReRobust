@java.lang.Override
public void onBackPressed() {
    System.out.println("log");
    ((com.themealz.themealz.TheMealzApplication) (((android.support.v7.app.AppCompatActivity) (mContext)).getApplication())).removeFromMealOptionsMap(parentID);
    super.onBackPressed();
}
