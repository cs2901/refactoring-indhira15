
static final double GRAVITATIONAL_CONST = 9.81;

double potentialEnergy(double mass, double height) {
  return mass * height * GRAVITATIONAL_CONST;
}