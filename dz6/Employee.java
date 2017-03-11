/** ������� ����� "���������" � ������: ���, ���������, email, �������, ��������, �������;

* ����������� ������ ������ ��������� ��� ���� ��� �������� �������;

* ������ ������ ���������� �������� �����, ������� ������� ���������� �� ������� � �������;

* ������� ������ �� 5 �����������

������:
Person[] persArray = new Person[5]; // ������� ��������� ������ ��������
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // ����� ��� ������ ������ ������� ������ ������
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
* � ������� ����� ������� ���������� ������ � ����������� ������ 40 ���; */

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
        System.out.println("��������� " + fio + " � ��������� " + position + ". email " + email + " ����� �������� " + phonenumber);
        System.out.println("�������� " + salary + " � �������� " + age + " ���.");
    }
}