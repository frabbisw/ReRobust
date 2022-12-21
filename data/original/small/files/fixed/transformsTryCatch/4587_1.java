@java.lang.Override
public void onLoadMore(int page) {
    try {
        listPokemonPresenter.list(app.caueferreira.oneapptocatchthemall.presentation.model.request.PokemonListRequest.create().withOffset(((page - 1) * 10)).withLimit(10));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
