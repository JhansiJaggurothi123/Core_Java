package oops1;
    class Tablet extends ElectronicDevice {
        public Tablet(String brand, String model) {
            super(brand, model);
        }

        @Override
        public void displaySpecifications() {
            System.out.println("Type: Tablet");
            super.displaySpecifications();
        }
    }

