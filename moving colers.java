int ud = 0;
int lr = 0;
int r = 5;
int g = 5;
int b = 495;

void setup() {
  size(500, 500);
  background(1000, 1000, 1000);
}
void draw() {
  if (keyCode == 39) {
    lr = lr + 11;
    r = r + 11;
    b = b - 11;
    println(lr);
  }
  if (keyCode == 37) {
    lr = lr - 11;
    r = r - 11;
    b = b + 11;
    println(lr);
  }
  if (lr >= 495) {
    lr = lr - 11;
  }
  if (lr <=-1) {
    lr = lr + 11;
  }
  if (keyCode == 40) {
    ud = ud + 11;
    g = g + 11;
    b = b - 11;
    println(lr);
  }
  if (keyCode == 38) {
    ud = ud - 11;
    b = b + 11;
    g = g - 11;
    println(ud);
  }
  if (ud >= 495) {
    ud = ud - 11;
  }
  if (ud <=-1) {
    ud = ud + 11;
  }
  if (r >= 495) {
    r = r - 11;
  }
  if (r <=5) {
    r = r + 11;
  }
  if (g >= 495) {
    g = g - 11;
  }
  if (g <=5) {
    g = g + 11;
  }
  if (b >= 495) {
    b = b - 11;
  }
  if (b <=5) {
    b = b + 11;
  }
  fill(r, g, b);
  rect(lr, ud, 10, 10);
}