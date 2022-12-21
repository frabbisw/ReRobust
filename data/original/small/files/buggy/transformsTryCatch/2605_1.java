@org.springframework.context.annotation.Bean
public org.springframework.web.servlet.view.tiles3.TilesConfigurer tilesConfigurer() {
    org.springframework.web.servlet.view.tiles3.TilesConfigurer tiles = new org.springframework.web.servlet.view.tiles3.TilesConfigurer();
    tiles.setDefinitions("/layout/tiles.xml", "/layout/admintiles.xml");
    try {
        tiles.setCheckRefresh(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return tiles;
}
