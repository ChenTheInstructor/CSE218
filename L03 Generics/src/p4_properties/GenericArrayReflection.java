package p4_properties;

import java.lang.reflect.Array;

public class GenericArrayReflection <T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArrayReflection(Class<T> clazz, int size) {
        // Using reflection to create a generic array
        this.array = (T[]) Array.newInstance(clazz, size);
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        return array[index];
    }

    public void printArray() {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        GenericArrayReflection<String> stringArray = new GenericArrayReflection<>(String.class, 5);
        stringArray.set(0, "Hello");
        stringArray.set(1, "World");
        
        System.out.println(stringArray.get(0)); // Output: Hello
        System.out.println(stringArray.get(1)); // Output: World
        
        GenericArrayReflection<Integer> intArray = new GenericArrayReflection<>(Integer.class, 3);
        intArray.set(0, 10);
        intArray.set(1, 20);
        
        System.out.println(intArray.get(0)); // Output: 10
        System.out.println(intArray.get(1)); // Output: 20
    }
}
