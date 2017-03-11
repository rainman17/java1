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
public class Main {
    public static void main(String[] args) {
        Employee employee[] = new Employee[5]; 
        employee[0] = new Employee("����������� ����", "�������", "ivivan@mailbox.com", "89231231234", 50000, 28);
        employee[1] = new Employee("������������ ����", "���������", "vikan@mailbox.com", "89268473294", 48000, 26);
        employee[2] = new Employee("��������� ���� ��������", "������", "kvera@mail.com", "89236789682", 100000, 52);
        employee[3] = new Employee("��������� ���������", "DevOps", "superalex@whitehouse.gov", "89777777777", 150000, 33);
        employee[4] = new Employee("��������� ������", "������� ���� ����", "infinity@president.gov.ru", "89231231234", 80000, 26);
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].age > 40) {
                employee[i].printInfo(); 
            }
        }
    }
}
