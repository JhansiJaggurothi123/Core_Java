package oops1;
    class Laptop extends ElectronicDevice {
        public Laptop(String brand, String model) {
            super(brand, model);
        }
        public void displaySpecifications() {
            System.out.println("Type: Laptop");
            super.displaySpecifications();
        }
    }

