/** Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;

* Конструктор класса должен заполнять эти поля при создании объекта;

* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;

* Создать массив из 5 сотрудников

Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
* С помощью цикла вывести информацию только о сотрудниках старше 40 лет; */
public class Main {
    public static void main(String[] args) {
        Employee employee[] = new Employee[5]; 
        employee[0] = new Employee("Златопупкин Иван", "Инженер", "ivivan@mailbox.com", "89231231234", 50000, 28);
        employee[1] = new Employee("Майнкрафтова Вика", "Инженерка", "vikan@mailbox.com", "89268473294", 48000, 26);
        employee[2] = new Employee("Командова Вера Ивановна", "ДиБиЭй", "kvera@mail.com", "89236789682", 100000, 52);
        employee[3] = new Employee("Плотников Александр", "DevOps", "superalex@whitehouse.gov", "89777777777", 150000, 33);
        employee[4] = new Employee("Мельников Эльдар", "Инженер всея руси", "infinity@president.gov.ru", "89231231234", 80000, 26);
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].age > 40) {
                employee[i].printInfo(); 
            }
        }
    }
}
