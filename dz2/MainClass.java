

/*
��������� ���������

  */
  
public class MainClass {
	public static void main(String[] args){
        int arr[][] = new int[4][5];
        System.out.println(arr[1].length);
		
		
	}
	
    
    
    
    
    
    
    
    
    
    
    
    
		//3. �������� ����� ����������� ��������� a * (b + (c / d)) � ������������ ���������,���
		//a, b, c, d � ������� ��������� ����� ������;
		
		public static int calculate(int a, int b, int c, int d){
			return (a * (b + (c / d)));
		}

		
		//4. �������� �����, ����������� �� ���� ��� �����, � ����������� ��� �� ����� ����� � ��������
		//�� 10 �� 20(������������), ���� �� � ������� true, � ��������� ������ � false;
		static boolean compare(int a, int b){
			int sum = a + b;
			if (sum >= 10 && sum <= 20) {
				return true;
			} else {
				return false;
			}
		//
			
		}
		
		
		//5. �������� �����, �������� � �������� ��������� ���������� ����� �����, ����� ������ ����������
		//� ������� ������������� �� ����� ��������, ��� �������������; ���������: ���� ������� ������������� ������.
			
		
		static void checkPositive(int a){
			if (a >= 0)  {
				System.out.println("������� ����� �������������.");
			} else {
				System.out.println("������� ����� �������������.");
			}
		}
		
		
		//6. �������� �����, �������� � �������� ��������� ���������� ����� �����, ����� ������ ������� true, ���� ����� �������������;
		
		
		static boolean isNegative(int a){
			boolean k = false;
			if (a < 0) {
				k = true;
			}
			return k;
		}
		
		//7. �������� �����, �������� � �������� ��������� ���������� ������, ������������ ���, ����� ������ �������
		//� ������� ��������� �������, ���������_���!�;
		
		static void sayHi(String a){
			System.out.println("������, " + a + "!");
		}
		
		//8. �������� �����, ������� ���������� �������� �� ��� ����������, � ������� ��������� � �������.
		//������ 4-� ��� �������� ����������, ����� ������� 100-��, ��� ���� ������ 400-� � ����������.
		
		static void checkViso(int a){
			if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) {
				System.out.println("��� - ����������!");
			} else {
				System.out.println("��� - �� ����������!");
			}
			
		}
		
		
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		