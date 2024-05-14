package oops1;
    class Phone extends ElectronicDevice {
        public Phone(String brand, String model) {
            super(brand, model);
        }
        public void displaySpecifications() {
            System.out.println("Type: Phone");
            super.displaySpecifications();
        }
    }


