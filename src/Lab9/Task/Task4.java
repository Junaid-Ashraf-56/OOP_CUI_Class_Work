package OOP_CUI_Class_Work.src.Lab9.Task;


interface Enumeration {
    boolean hasNext(int index);
    Object getNext(int index);
}

class Task4 implements Enumeration {
    String[] names;
    int size;

    public Task4(String[] inputNames) {
        this.names = inputNames;
        this.size = inputNames.length;
    }

    public boolean hasNext(int index) {
        return index < size;
    }

    public Object getNext(int index) {
        if (hasNext(index)) {
            return names[index];
        }
        return null;
    }

    public static void main(String[] args) {
        // Sample names array
        String[] sampleNames = {"Alice", "Bob", "Charlie", "David", "Eve"};

        Task4 nameCollection = new Task4(sampleNames);

        int index = 0;
        while (nameCollection.hasNext(index)) {
            System.out.println(nameCollection.getNext(index));
            index++;
        }
    }
}
