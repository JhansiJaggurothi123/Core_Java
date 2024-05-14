package oops1;
public class ElectronicDevice {
        private String brand;
        private String model;

        public ElectronicDevice(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public void displaySpecifications() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
        }
    }



