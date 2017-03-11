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

class Employee {
    String fio;
    String position;
    String email;
    String phonenumber; 
    int salary, age;
    
    Employee() {
        
    }
    
    Employee (String fio, String position, String email, String phonenumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.age = age;
    }
    
    void printInfo() {
        System.out.println("Сотрудник " + fio + " в должности " + position + ". email " + email + " Номер телефона " + phonenumber);
        System.out.println("Зарплата " + salary + " в возрасте " + age + " лет.");
    }
}