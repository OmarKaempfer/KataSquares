import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestUnit {

    @Test
    public void testGetUnique() {
        ArrayComparer arrayComparer = new ArrayComparer();
        assertArrayEquals(new int[] {1, 2, 3, 4, 5},
                arrayComparer.getUniqueElementsArray(new int[] {1, 2, 3, 4, 5}));
        assertArrayEquals(new int[] {1, 2, 3, 4},
                arrayComparer.getUniqueElementsArray(new int[] {1, 2, 3, 4, 4, 4}));
        assertArrayEquals(new int[] {1,2,3,4},
                arrayComparer.getUniqueElementsArray(new int[] {1, 1, 2, 2, 3, 3, 4, 4}));
        assertArrayEquals(new int[] {}, arrayComparer.getUniqueElementsArray(new int[] {}));
        assertArrayEquals(new int[] {4,3,2,1},
                arrayComparer.getUniqueElementsArray(new int[] {4,3,2,1,4,3,2,1}));
    }

    @Test
    public void testContains() {
        ArrayComparer arrayComparer = new ArrayComparer();
        assertTrue(arrayComparer.contains(new int[]{1,2,3,4}, 3));
        assertFalse(arrayComparer.contains(new int[]{1,2,3,4}, 5));
        assertFalse(arrayComparer.contains(new int[]{}, 3));
    }

    @Test
    public void testGetElementsFrequency() {
        ArrayComparer arrayComparer = new ArrayComparer();
        assertTrue(arrayComparer.getElementFrequency(new int[]{1,2,3,4}, 3) == 1);
        assertTrue(arrayComparer.getElementFrequency(new int[]{1,2,3,4}, 5) == 0);
        assertTrue(arrayComparer.getElementFrequency(new int[]{1,2,3,4,5,4,3,4}, 4) == 3);
        assertTrue(arrayComparer.getElementFrequency(new int[]{}, 3) == 0);
    }

    @Test
    public void testCompareSquaredCondition() {
        ArrayComparer arrayComparer = new ArrayComparer();
        assertTrue(arrayComparer.compareSquaredCondition(new int[] {1,2,2,4}, new int[] {4,16,1,4}));
        assertTrue(arrayComparer.compareSquaredCondition(new int[] {}, new int[] {}));
        assertFalse(arrayComparer.compareSquaredCondition(new int[] {1,2,2,4}, new int[] {4,4,1,4}));
    }
}
