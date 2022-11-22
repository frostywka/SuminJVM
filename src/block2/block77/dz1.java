package block2.block77;

public class dz1 {
    public static void main(String[] args) {

        String[] nameOfMonth = {"January", "February", "Mart", "April", "May", "june", "july", "august", "setember", "october", "november", "december"};
        for (String i : nameOfMonth) {
            System.out.println("\'" + i + "\',");
        }


        // Решение от Сумина
        // вывести все месяцы через запятую ! а у последнего элемента поставить точку

        String[] namesOfMonth = {  // создание массива с данными
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
        String result = "";  // Нужно создать переменную с результатом куда будет выводиться ответ
        for (int j = 0; j <namesOfMonth.length; j++){ // цикл FOR чтобы определить последнее значение в цикле(счетчике
            result += namesOfMonth[j]; // к нашей переменной нужно прикрепить первый месяц
            if (j==namesOfMonth.length-1) {// индекс последнего массива равен -1 ! Проверка последений ли перед нами элемент
                result +="."; // если последний элемент,

                // то добавляем точку
            } else {
                result +=", "; // если Не последний элемент, то запятая
            }
         }
        System.out.println(result);
    }
}
