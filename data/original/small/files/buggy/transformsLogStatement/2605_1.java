@org.springframework.context.annotation.Bean
public org.springframework.web.servlet.view.tiles3.TilesConfigurer tilesConfigurer() {
    org.springframework.web.servlet.view.tiles3.TilesConfigurer tiles = new org.springframework.web.servlet.view.tiles3.TilesConfigurer();
    System.out.println("log");
    tiles.setDefinitions("/layout/tiles.xml", "/layout/admintiles.xml");
    tiles.setCheckRefresh(true);
    return tiles;
}
