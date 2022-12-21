@org.springframework.context.annotation.Bean
public org.springframework.web.servlet.view.tiles3.TilesConfigurer tilesConfigurer() {
    org.springframework.web.servlet.view.tiles3.TilesConfigurer tiles = new org.springframework.web.servlet.view.tiles3.TilesConfigurer();
    try {
        tiles.setDefinitions("/layout/tiles.xml");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    tiles.setCheckRefresh(true);
    return tiles;
}
