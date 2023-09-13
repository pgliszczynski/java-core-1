package task1;

public class ArraySorter {
    public boolean isSortedAscending(int arraySize, String values) {
        String[] valuesArray = values.split(" ");

        for(int i = 0; i < arraySize-1; i++) {
            int actualValue;
            int nextValue;

            try {
                actualValue = Integer.parseInt(valuesArray[i]);
                nextValue = Integer.parseInt(valuesArray[i + 1]);
            } catch (NumberFormatException e) {
                System.out.println("Entered invalid values!");
                return false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Entered invalid array size!");
                return false;
            }

            if(actualValue > nextValue) {
                return false;
            }
        }
        return true;
    }
}
