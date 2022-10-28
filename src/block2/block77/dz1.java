package block2.block77;

public class dz1 {
    public static void main(String[] args) {

        String[] nameOfMonth = {"January", "February", "Mart", "April", "May", "june", "july", "august", "setember", "october", "november", "december"};
        for (String i : nameOfMonth) {
            System.out.println("\'" + i + "\',");
        }


        // Решение от Сумина
        // вывести все месяцы через запятую ! а у последнего элемента поставить точку

        String[] namesOfMonth = {
                "Январь",
                "Февраль",
                "Март",
                "Апрель",
                "Май",
                "Июнь",
                "Июль",
                "Август",
                "Сентябрь",
                "Октябрь",
                "Ноябрь",
                "Декабрь"
        };
        String result = "";
        for (int j = 0; j <namesOfMonth.length; j++){
            result += namesOfMonth[j];
            if (j==namesOfMonth.length-1) {// индекс последнего массива равен -1
                result +=".";
            } else {
                result +=", ";
            }
         }
        System.out.println(result);
    }
}
