
void mod_height(int value){
    height = value;
}
void mod_width(value){
    width = value;
}

void setValue(String name, int value) {
  if (name.equals("height")) {
        mod_height(value);
    return;
  }
  if (name.equals("width")) {
        mod_width(value)
    return;
  }
  Assert.shouldNeverReachHere();
}