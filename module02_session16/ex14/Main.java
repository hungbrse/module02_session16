package module02_session16.ex14;

import static module02_session16.ex14.Sort.*;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Alice", 85.5),
                new Student(2, "Bob", 78.0),
                new Student(3, "Charlie", 92.5),
                new Student(4, "David", 70.0),
                new Student(5, "Eve", 88.0)
        };

        Student[] arrForSelectionSort = students.clone();
        Student[] arrForInsertionSort = students.clone();
        Student[] arrForBubbleSort = students.clone();

        System.out.println("Danh sách học viên sau khi sắp xếp bằng Selection Sort:");
        Student[] sortedBySelection = selectionSort(arrForSelectionSort);
        for (Student student : sortedBySelection) {
            System.out.println(student);
        }

        System.out.println("\nDanh sách học viên sau khi sắp xếp bằng Insertion Sort:");
        Student[] sortedByInsertion = insertionSort(arrForInsertionSort);
        for (Student student : sortedByInsertion) {
            System.out.println(student);
        }

        System.out.println("\nDanh sách học viên sau khi sắp xếp bằng Bubble Sort:");
        Student[] sortedByBubble = bubbleSort(arrForBubbleSort);
        for (Student student : sortedByBubble) {
            System.out.println(student);
        }
    }
    }
