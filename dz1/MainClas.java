

/*
Alexander Plotnikov
lalala 1st program on Java
1. Создать пустой проект в IntelliJ IDEA и прописать метод main();

2. Создать переменные всех пройденных типов данных, и инициализировать их значения;

3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где
 a, b, c, d – входные параметры этого метода;

4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
 от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
 в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;

7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести
 в консоль сообщение «Привет, указанное_имя!»;

8. Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
 Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
  */
  
public class MainClas {
	public static void main(String[] args){
		
		// 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
		int a = 10;
		char b = 'z';
		String c = "Привет";
		float d = 1.5335f;
		boolean e = true;
		byte f = 127;
		short g = 7777;
		long h = 456976;
		double i = 4343.5454;
		
		// 3.
		int result = calculate(3,4,6,2);
		System.out.println("a * (b + (c / d)) = " + result);
		
		// 4.
		System.out.println("Проверка 4го задания = " + compare(5,7));	
		
		//5.
		checkPositive(7);	
		
		//6.
		System.out.println(isNegative(-9));
		
		//7.
		sayHi("Красавчик");
		
		//8.
		checkViso(400);
		
		
	}
	
		//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где
		//a, b, c, d – входные параметры этого метода;
		
		public static int calculate(int a, int b, int c, int d){
			return (a * (b + (c / d)));
		}

		
		//4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
		//от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
		static boolean compare(int a, int b){
			int sum = a + b;
			if (sum >= 10 && sum <= 20) {
				return true;
			} else {
				return false;
			}
		//
			
		}
		
		
		//5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
		//в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
			
		
		static void checkPositive(int a){
			if (a >= 0)  {
				System.out.println("Входное число положительное.");
			} else {
				System.out.println("Входное число отрицательное.");
			}
		}
		
		
		//6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
		
		
		static boolean isNegative(int a){
			boolean k = false;
			if (a < 0) {
				k = true;
			}
			return k;
		}
		
		//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести
		//в консоль сообщение «Привет, указанное_имя!»;
		
		static void sayHi(String a){
			System.out.println("Привет, " + a + "!");
		}
		
		//8. Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
		//Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
		
		static void checkViso(int a){
			if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) {
				System.out.println("Год - високосный!");
			} else {
				System.out.println("Год - НЕ високосный!");
			}
			
		}
		
		
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		