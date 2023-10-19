public class NumberConvertor {
    public static String convertToFormattedPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return "";
        }

        String formattedPhoneNumber = phoneNumber.trim().replaceAll("[^0-9]", "");

        if (formattedPhoneNumber.length() == 11 && formattedPhoneNumber.startsWith("8")) {
            // Если номер российский и начинается с "8", заменяем его на "+7"
            formattedPhoneNumber = "+7" + formattedPhoneNumber.substring(1);
        } else if (formattedPhoneNumber.length() == 12 && formattedPhoneNumber.startsWith("+")) {
            // Если номер имеет формат "+<Код страны>...", оставляем его без изменений
        } else {
            // Некорректный формат номера
            return "Некорректный формат номера";
        }

        // Форматирование номера в виде "+<Код страны><Три цифры>-<Три цифры>-<Четыре цифры>"
        formattedPhoneNumber = formattedPhoneNumber.substring(0, 3) + "-"
                + formattedPhoneNumber.substring(3, 6) + "-"
                + formattedPhoneNumber.substring(6);

        return formattedPhoneNumber;
    }

    public static void main(String[] args) {
        // Примеры строковых представлений телефонных номеров
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";

        // Преобразование и вывод
        System.out.println("Исходный номер: " + phoneNumber1);
        System.out.println("Форматированный номер: " + convertToFormattedPhoneNumber(phoneNumber1));

        System.out.println("\nИсходный номер: " + phoneNumber2);
        System.out.println("Форматированный номер: " + convertToFormattedPhoneNumber(phoneNumber2));

        System.out.println("\nИсходный номер: " + phoneNumber3);
        System.out.println("Форматированный номер: " + convertToFormattedPhoneNumber(phoneNumber3));
    }
}
