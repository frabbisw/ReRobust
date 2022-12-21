@java.lang.Override
public void onLoadMore(int page) {
    System.out.println("log");
    listPokemonPresenter.list(app.caueferreira.oneapptocatchthemall.presentation.model.request.PokemonListRequest.create().withOffset((page * 10)).withLimit(10));
}
