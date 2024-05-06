
//Menu based application on Array Operations: create an application which will display list of operations on array.
//--> Insert an element in first index
//--> Insert an element in last index
//--> Insert an element in specified index
//--> Remove element from first index
//--> Remove element from last index
//--> Remove element from specified index
//--> Remove user entered element
//--> Display all in ASC/DESC order.
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        int size = 0;
        while (true) {
            System.out.println("\nArray Operations Menu:");
            System.out.println("1. Insert an element in first index");
            System.out.println("2. Insert an element in last index");
            System.out.println("3. Insert an element in specified index");
            System.out.println("4. Remove element from first index");
            System.out.println("5. Remove element from last index");
            System.out.println("6. Remove element from specified index");
            System.out.println("7. Remove user entered element");
            System.out.println("8. Display all in ascending order");
            System.out.println("9. Display all in descending order");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert at first index: ");
                    int elementFirst = scanner.nextInt();
                    insertFirst(arr, elementFirst, size++);
                    break;
                case 2:
                    System.out.print("Enter the element to insert at last index: ");
                    int elementLast = scanner.nextInt();
                    insertLast(arr,elementLast,size++);
                    break;
                case 3:
                    System.out.print("Enter the element to insert: ");
                    int element = scanner.nextInt();
                    System.out.print("Enter the index to insert at: ");
                    int index = scanner.nextInt();
                    insertAt(arr, element, index, size++);
                    break;
                case 4:
                    System.out.print("Enter  remove first  element from: ");
                    removeFirst(arr,size--);
                    break;
                case 5:
                    System.out.print("Enter remove last  element from: ");
                    removeLast(arr, size--);
                    break;
                case 6:
                    System.out.print("Enter the index to remove element from: ");
                    int removeIndex = scanner.nextInt();
                    removeAt(arr, removeIndex, size--);
                    break;
                case 7:
                    System.out.print("Enter the element to remove: ");
                    int removeElement = scanner.nextInt();
                    removeElement(arr, removeElement, size--);
                    break;
                case 8:
                    displayAscending(arr, size);
                    break;
                case 9:
                    displayDescending(arr, size);
                    break;
                case 10:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 10.");
            }
        }
    }

    // Insert element at first index
    public static void insertFirst(int[] arr, int element, int size) {
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = element;
        System.out.println("Element inserted at first index successfully.");
    }

    // Insert element at last index
    public static void insertLast(int[] arr, int element, int size) {
        arr[size] = element;
        System.out.println("Element inserted at last index successfully.");
    }

    // Insert element at specified index
    public static void insertAt(int[] arr, int element, int index, int size) {
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        System.out.println("Element inserted at index " + index + " successfully.");
    }

    // Remove element from first index
    public static void removeFirst(int[] arr, int size) {
        if (size == 0) {
            System.out.println("Array is empty. No element to remove.");
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Element removed from first index successfully.");
    }

    // Remove element from last index
    public static void removeLast(int[] arr, int size) {
        if (size == 0) {
            System.out.println("Array is empty. No element to remove.");
            return;
        }
        arr[size - 1] = 0;
        System.out.println("Element removed from last index successfully.");
    }

    // Remove element from specified index
    public static void removeAt(int[] arr, int index, int size) {
        if (size == 0) {
            System.out.println("Array is empty. No element to remove.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Element removed from index " + index + " successfully.");
    }

    // Remove user entered element
    public static void removeElement(int[] arr, int element, int size) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                found = true;
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                size--;
                break;
            }
        }
        if (found) {
            System.out.println("Element " + element + " removed successfully.");
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    // Display array in ascending order
    public static void displayAscending(int[] arr, int size) {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int[] sortedArr = Arrays.copyOf(arr, size);
        Arrays.sort(sortedArr);
        System.out.println("Array elements in ascending order:");
        for (int element : sortedArr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Display array in descending order
    public static void displayDescending(int[] arr, int size) {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int[] sortedArr = Arrays.copyOf(arr, size);
        Arrays.sort(sortedArr);
        System.out.println("Array elements in descending order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();
    }
}
