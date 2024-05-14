package oops1;
    class Smartphone extends Phone {
        public Smartphone(String brand, String model) {
            super(brand, model);
        }

        @Override
        public void displaySpecifications() {
            System.out.println("Type: Smartphone");
            super.displaySpecifications();
        }
    }


