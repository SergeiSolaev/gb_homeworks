import org.assertj.core.util.Strings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListTests {

    @Test
    public void testLengthCreateArrayException() throws Exception {
        List listTest = new List(0);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,() -> listTest.createList());
    }
    @Test
    public void testLengthCreateArray() throws Exception {
        List listTest = new List(5);
        listTest.createList();
        Assertions.assertEquals(5, listTest.getListLength());
    }
    @Test
    public void testsAvgSum(){

        List testList = new List(5);
        testList.setAddListElement(5);
        testList.setAddListElement(5);
        testList.setAddListElement(5);
        testList.setAddListElement(5);
        testList.setAddListElement(5);
        Assertions.assertEquals(5, testList.avgSum());
    }

    @Test
    public void testComparatorOneMoreTwo(){
        ListComparator comparator = new ListComparator();
        Assertions.assertEquals("Первый список имеет большее среднее значение: "
                + 10 + " > " + 5, comparator.compareAvgSumLists(10,5));
    }
    @Test
    public void testComparatorTwoMoreOne(){
        ListComparator comparator = new ListComparator();
        Assertions.assertEquals("Второй список имеет большее среднее значение: "
                + 5 + " < " + 10, comparator.compareAvgSumLists(5,10));
    }

    @Test
    public void testComparatorOneEquallyTwo(){
        ListComparator comparator = new ListComparator();
        Assertions.assertEquals("Средние значения равны:  "
                + 5 + " = " + 5, comparator.compareAvgSumLists(5,5));
    }

    @Test
    public void testMain() throws Exception {
        List testList1 = new List(5);
        testList1.setAddListElement(5);
        testList1.setAddListElement(5);
        List testList2 = new List(5);
        testList2.setAddListElement(5);
        testList2.setAddListElement(5);
        ListComparator comparator = new ListComparator();
        Assertions.assertEquals("Средние значения равны:  5 = 5", comparator.compareAvgSumLists(testList1.avgSum(),
                testList2.avgSum()));
    }
}
