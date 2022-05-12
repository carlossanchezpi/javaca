public enum Transporte{
  AVION(900,10),
  TREN(200,14),
  COCHE(120,12),
  BICICLETA(20,0);
  private double kilometros;
  private double precio;
  Transporte(double kilometros, double precio){
    this.kilometros=kilometros;
    this.precio=precio;
  }
  public double getKilometros(){
    return this.kilometros;
  }
  public void setKilometros(double kilometros){
    this.kilometros = kilometros;
  }
  public double getPrecio(){
    return this.precio;
  }
  public void setPrecio(double precio){
    this.precio = precio;
  }
  public double tiempo(double km){
    double espera = 1;
    double tiempoTotal = km/this.kilometros;
    if (this == AVION) tiempoTotal += espera;
    return tiempoTotal;
  }
  public double precioTotal(double km){
    return (km/100)*this.precio;
  }
}
