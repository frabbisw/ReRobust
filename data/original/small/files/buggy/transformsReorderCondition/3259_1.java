private static boolean numberIsThree(minesweeper.Pixel squareOffset) {
    minesweeper.PixelColors threePixelColors = new minesweeper.PixelColors(minesweeper.ComputerVision.threePixel, squareOffset);
    if (((threePixelColors.green) < 10) && ((threePixelColors.blue) < 20)) {
        return true;
    }
    return false;
}
