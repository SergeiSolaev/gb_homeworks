public class Main {

    public static void main(String[] args) throws Exception {
        List list1 = new List(1);
        List list2 = new List(5);
        list1.createList();
        list2.createList();
        ListComparator comparator = new ListComparator();
        System.out.println(comparator.compareAvgSumLists(list1.avgSum(),
                list2.avgSum()));
    }
}

//        System.out.println("Первый список чисел: " + list1.toString());
//        System.out.println("Второй список чисел: " + list2.toString());
