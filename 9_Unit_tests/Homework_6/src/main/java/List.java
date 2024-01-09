import java.util.ArrayList;
import java.util.Random;

class List {
    private int length;
    private ArrayList<Integer> list = new ArrayList<Integer>(length);

    List(int length) {
        this.length = length;

    }

    void createList() throws Exception {
        if (this.length <= 0) {
            throw new ArrayIndexOutOfBoundsException(
                    "Длина списка чисел не может быть меньше 1!");
        }
        for (int i = 0; i < this.length; i++) {
            Random random = new Random();
            int arrayElement = random.nextInt(-100, 101);
            list.add(arrayElement);
        }
    }
    public int getListLength() {
        return list.size();
    }

    public void setAddListElement(int i) {
        list.add(i);
    }

        public int avgSum() {
         int avgSum = 0;
        for (int i = 0; i < list.size(); i++) {
            avgSum = list.get(i) + avgSum;
        }
        return avgSum / list.size();
    }

}

//    @Override
//    public String toString() {
//        return list.toString();
//    }

