public void setListObjects(java.util.List<com.golub.golubroman.megakittest.Cars.CarModel> carModels) {
    try {
        if ((this.carModels.size()) > 0)
            this.carModels.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.carModels = carModels;
    this.notifyDataSetChanged();
}
