package day17collection2;

public class Bike {
 private String brand;
 private int price;
 private String color;
 private String noPlate;
 public void setBrand(String brand) {
	 this.brand=brand;
 }public void setPrice(int price) {
	 this.price=price;
 }
 public void setColor(String color) {
	 this.color=color;
 }
 public void setNoPlate(String noPlate) {
	 this.noPlate=noPlate;
 }
 public String getBrand() {
	 return brand;
 }public int getPrice() {
	 return price;
 }public String getColor() {
	 return color;
 }public String getNoPlate() {
	 return noPlate;
 }
 public Bike(String brand,int price,String color,String noPlate) {
	 this.brand=brand;
	 this.price=price;
	 this.color=color;
	 this.noPlate=noPlate;
 }
 public String toString() {
	 return brand+price+color+noPlate;
 }
}
