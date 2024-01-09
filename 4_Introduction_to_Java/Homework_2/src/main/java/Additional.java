//*Сравнить время выполнения замены символа "а" на "А" любой строки
//        содержащей >1000 символов средствами String и StringBuilder.
public class Additional {
    public static void main(String[] args) {
        String s1 = "";
        StringBuilder builder1 = new StringBuilder(10000);

        for (int i = 0; i < 10000; i++) {
            s1 += "a";
        }

        long start = System.nanoTime();
        s1.replace('a', 'A');
        System.out.println(System.nanoTime() - start);


        for (int i = 0; i < 10000; i++) {
            builder1.append("a");
        }
        start = System.nanoTime();
        builder1.replace(0, builder1.length()-1, "A");
        System.out.println(System.nanoTime() - start);
        }


}
