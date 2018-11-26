
public class ArrayComparer {
    public boolean compareSquaredCondition(int[] firstArray, int[] secondArray) {
        if(firstArray.length != secondArray.length) return false;

        int[] uniqueElements = getUniqueElementsArray(firstArray);

        for(int i = 0; i < uniqueElements.length; i++) {
            if(getElementFrequency(firstArray, uniqueElements[i]) !=
                    getElementFrequency(secondArray, uniqueElements[i]*uniqueElements[i])) {
                return false;
            }
        }
        return true;
    }

    public int[] getUniqueElementsArray(int[] firstArray) {
        int[] uniqueElements = new int[firstArray.length];
        int element;
        int j = 0;

        for(int i = 0; i < firstArray.length; i++) {
            element = firstArray[i];
            if(!contains(uniqueElements, element)) {
                uniqueElements[j] = element;
                j++;
            }
        }

        if(j != firstArray.length) {
            int[] fittedUniqueElements = new int[j];
            for(int i = 0; i < j; i++) {
                fittedUniqueElements[i] = uniqueElements[i];
            }
            return fittedUniqueElements;
        }
        return uniqueElements;
    }

    public boolean contains(int[] array, int element) {
        for(int currentElement : array) {
            if(currentElement == element) {
                return true;
            }
        }
        return false;
    }

    public int getElementFrequency(int[] array, int element) {
        int elementFrequency = 0;

        for(int currentElement : array) {
            if(currentElement == element) elementFrequency++;
        }

        return elementFrequency;
    }

}
