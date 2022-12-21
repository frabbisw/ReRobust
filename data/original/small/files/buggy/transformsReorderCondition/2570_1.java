public void setListObjects(java.util.List<com.golub.golubroman.megakittest.Cars.CarModel> carModels) {
    if (0 < (this.carModels.size()))
        this.carModels.clear();
    this.carModels = carModels;
    notifyDataSetChanged();
}
