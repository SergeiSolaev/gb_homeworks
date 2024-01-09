public class Homework1 {
    public static void main(String[] args) {

        StringBuilder request = new StringBuilder("select * from students where ");
        StringBuilder where = new StringBuilder(
                "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");

        where.deleteCharAt(0).deleteCharAt(where.length()-1); //удаляем фигурные скобки

        for (int i = 0; i < where.length(); i++) {
            if (where.charAt(i) == ',') {
                where.replace(i,i+1, " AND");
            }
        }  //меняем запятые на AND

        for (int i = 0; i < where.length(); i++) {
            if (where.charAt(i) == ':') {
                where.replace(i,i+1, " = ");
            }
        }  //меняем : на =

        // убираем кавычки в имени параметра запроса
        where.replace(where.indexOf("\"name\""),where.indexOf("\"name\"")+6, "name");
        where.replace(where.indexOf("\"country\""),where.indexOf("\"country\"")+9, "country");
        where.replace(where.indexOf("\"city\""),where.indexOf("\"city\"")+6, "city");
        where.replace(where.indexOf("\"age\""),where.indexOf("\"age\"")+5, "age");

        // разделяем запрос на части для последующего анализа
        String where_str = where.toString();
        String[] where_arr= where_str.split(" AND ");

        //анализируем массив на наличие null и собираем строку для части запроса WHERE

        String where_res_str = "";
        for (int i = 0; i < where_arr.length; i++) {
            if (where_arr[i].contains("null") != true){
                where_res_str += " AND " + where_arr[i];
            }
        }
        StringBuilder where_res = new StringBuilder(where_res_str);
        where_res.delete(0,5);

        // собираем финальный запрос
        request = request.append(where_res);

        System.out.println(request);
    }
}


//{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//name = "Ivanov" AND country = "Russia" AND city = "Moscow" AND age = "null"