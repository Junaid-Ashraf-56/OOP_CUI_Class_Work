package OOP_CUI_Class_Work.src.Lab9.Task;


interface Enumeration {
    // Return true if a value exists in the next index
    boolean hasNext(int index);

    // Returns the next element in the collection as an Object
    Object getNext(int index);
}

class Task4 implements Enumeration {
    String[] names;
    int size;

    // Constructor to initialize the names array
    public Task4(String[] inputNames) {
        this.names = inputNames;
        this.size = inputNames.length;
    }

    // Method to check if there is a next value in the collection
    public boolean hasNext(int index) {
        return index < size;
    }

    // Method to return the next element in the collection
    public Object getNext(int index) {
        if (hasNext(index)) {
            return names[index];
        }
        return null;
    }

    public static void main(String[] args) {
        // Sample names array
        String[] sampleNames = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Create a NameCollection object
        Task4 nameCollection = new Task4(sampleNames);

        // Iterate through the enumeration outputting each name
        int index = 0;
        while (nameCollection.hasNext(index)) {
            System.out.println(nameCollection.getNext(index));
            index++;
        }
    }
}
