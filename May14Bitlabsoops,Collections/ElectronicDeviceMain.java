package oops1;
public class ElectronicDeviceMain {
        public static void main(String[] args) {
            Phone phone = new Phone("Apple", "iPhone 12");
            Laptop laptop = new Laptop("Dell", "XPS 13");
            Tablet tablet = new Tablet("Samsung", "Galaxy Tab S7");
            Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21");
            phone.displaySpecifications();
            System.out.println();
            laptop.displaySpecifications();
            System.out.println();
            tablet.displaySpecifications();
            System.out.println();
            smartphone.displaySpecifications();
        }
    }


