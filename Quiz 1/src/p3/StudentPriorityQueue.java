package p3;
public class StudentPriorityQueue {

    private Student[] data;
    private int size;

    public StudentPriorityQueue(int capacity) {
        data = new Student[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(Student student) {

        if (size == data.length) {
            throw new IllegalStateException("Priority queue is full.");
        }

        int i = size - 1;

        // Shift students with higher GPAs one position
        // to the right.
        while (i >= 0 &&
               data[i].getGpa() > student.getGpa()) {

            data[i + 1] = data[i];
            i--;
        }

        data[i + 1] = student;
        size++;
    }

    public Student remove() {

        if (isEmpty()) {
            throw new IllegalStateException(
                "Priority queue is empty.");
        }

        Student result = data[size - 1];

        data[size - 1] = null;
        size--;

        return result;
    }

    public Student peek() {

        if (isEmpty()) {
            throw new IllegalStateException(
                "Priority queue is empty.");
        }

        return data[size - 1];
    }

    @Override
    public String toString() {

        if (isEmpty()) {
            return "Priority queue is empty.";
        }

        String result = "";

        for (int i = size - 1; i >= 0; i--) {
            result += data[i] + "\n";
        }

        return result;
    }
}