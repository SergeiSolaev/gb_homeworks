public class ListComparator {

    public String compareAvgSumLists(int avgSumList1, int avgSumList2) {
        if (avgSumList1 > avgSumList2) {
            return "Первый список имеет большее среднее значение: "
                    + avgSumList1 + " > " + avgSumList2;
        }   else if (avgSumList1 < avgSumList2) {
            return "Второй список имеет большее среднее значение: "
                    + avgSumList1 + " < " + avgSumList2;
        }   else {
            return "Средние значения равны:  "
                    + avgSumList1 + " = " + avgSumList2;
        }
    }
}

