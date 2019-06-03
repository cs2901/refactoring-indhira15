void renderBanner() {
    final boolean condicion1 = platform.toUpperCase().indexOf("MAC") > -1;
    final boolean condicion2 = browser.toUpperCase().indexOf("IE") > -1;
    final boolean condicion3 = wasInitialized();
    final boolean condicion4 = resize > 0;
  if (condicion1 && condicion2 && condicion3 && condicion4)
  {
    // do something
  }
}