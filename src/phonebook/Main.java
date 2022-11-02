package phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
            phoneBook.addContact("Иван Иванов","+1234567890");
            phoneBook.addContact("Петр Петров","+2345678901");
            phoneBook.addContact("Сидр Сидоров","+3456789012");
            phoneBook.addContact("Вася Васечкин","+4567890123");
            phoneBook.addContact("Кузя Кузмич","+5678901234");
            phoneBook.addContact("Александр Пушкин","+6789012345");
            phoneBook.addContact("Евгений Онегин","+7890123456");
            phoneBook.addContact("Лев Толстой","+8901234567");
            phoneBook.addContact("Петр Столыпин","+9012345678");
            phoneBook.addContact("Василий Тёркин","+0123456789");
            phoneBook.addContact("Сергей Есенин","+123456789");
            phoneBook.addContact("Фёдор Тютчев","+234567890");
            phoneBook.addContact("Михаил Лермонтов","+345678901");
            phoneBook.addContact("Михаил Ломоносов","+456789012");
            phoneBook.addContact("Юрий Долгорукий","+567890123");
            phoneBook.addContact("Ярослав Мудрый","+678901234");
            phoneBook.addContact("Владимир Красносолнышко","+789012345");
            phoneBook.addContact("Олег Вещий","+890123456");
            phoneBook.addContact("Георгий Жуков","+901234567");
            phoneBook.addContact("Иван Третий","+012345678");

        System.out.println(phoneBook.count);
        System.out.println(phoneBook.phoneNumbers);

        PhoneBook.getPhoneNumber(phoneBook.phoneNumbers);

    }
}
