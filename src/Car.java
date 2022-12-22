public class Car {
   private String brand;
   private String model;
   private String bodyColor;
   private double engineSize;
   private String countryOfOrigin;
   private int yearOfManufacture;

    String brand1 = "Lada";
    String model1 = "Grande";
    String countryOfOrigin1 = "Россия";
    String bodyColor1 = "жёлтый";
    double engineSize1 = 1.7;
    int yearOfManufacture1 = 2015;

    String brand2 = "Audi";
    String model2 = "A8 50 L TDI quattro";
    String countryOfOrigin2 = "Германия";
    String bodyColor2 = "чёрный";
    double engineSize2 = 3.0;
    int yearOfManufacture2 = 2020;

    String brand3 = "BMW";
    String model3 = "Z8";
    int yearOfManufacture3 = 2021;

    String brand4 = "Kia";
    String model4 = "Sportage 4 поколение";
    String countryOfOrigin4 = "Южная Корея";
    String bodyColor4 = "красный";
    double engineSize4 = 2.4;
    int yearOfManufacture4 = 2018;

    String brand5 = "Hyundai";
    String model5 = "Avante";
    String bodyColor5 = "оранжевый";
    double engineSize5 = 1.6;
    int yearOfManufacture5 = 2016;

 public String getBrand() {
  return brand;
 }

 public void setBrand(String brand) {
  this.brand = brand;
 }

 public String getModel() {
  return model;
 }

 public void setModel(String model) {
  this.model = model;
 }

 public String getBodyColor() {
  return bodyColor;
 }

 public void setBodyColor(String bodyColor) {
  this.bodyColor = bodyColor;
 }

 public double getEngineSize() {
  return engineSize;
 }

 public void setEngineSize(double engineSize) {
  this.engineSize = engineSize;
 }

 public String getCountryOfOrigin() {
  return countryOfOrigin;
 }

 public void setCountryOfOrigin(String countryOfOrigin) {
  this.countryOfOrigin = countryOfOrigin;
 }

 public int getYearOfManufacture() {
  return yearOfManufacture;
 }

 public void setYearOfManufacture(int yearOfManufacture) {
  this.yearOfManufacture = yearOfManufacture;
 }

 public Car() {
  this.brand = brand;
  this.model = model;
  this.bodyColor = bodyColor;
  this.countryOfOrigin = countryOfOrigin;
  this.engineSize = engineSize;
  this.yearOfManufacture = yearOfManufacture;

 }

}

