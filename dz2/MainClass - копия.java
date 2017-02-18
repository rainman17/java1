

/*
��������� ���������
��2
1 ������ ������������� ������, ��������� �� ��������� 0 � 1. ��������: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
� ������� ����� � ������� �������� 0 �� 1, 1 �� 0;
2 ������ ������ ������������� ������ �������� 8. � ������� ����� ��������� ��� ���������� 0 3 6 9 12 15 18 21;
3 ������ ������ [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] ������ �� ���� ������, � ����� ������� 6 �������� �� 2;
4 ������� ���������� ��������� ������������� ������ (���������� ����� � �������� ����������),
� � ������� �����(-��) ��������� ��� ������������ �������� ���������;
5 ** ������ ���������� ������ � ����� � ��� ����������� � ������������ �������� (��� ������ ���������);
6 ** �������� �����, � ������� ���������� �� ������ ���������� ������������� ������, ����� ������ �������
true ���� � ������� ���� �����, � ������� ����� ����� � ������ ����� ������� �����.
�������: checkBalance([1, 1, 1, || 2, 1]) > true, checkBalance ([2, 1, 1, 2, 1]) > false, checkBalance ([10, || 10]) > true,
������� �������� ��������� ||, ��� ������� � ������ �� ������.
7 **** �������� �����, �������� �� ���� �������� ���������� ������ � ����� n (����� ���� �������������, ��� �������������),
��� ���� ����� ������ �������� ��� �������� ������� �� n. ��� ���������� ������ ������ ������������ ���������������� ���������.
  */
  
public class MainClass {
	public static void main(String[] args){
        createArr();
        createArr8();
		changeArr();
        createMatrix();
        findMinMax();
        System.out.println("������� 6:");
        System.out.println(checkBalance(new int[]{5,3,7,4,2,9}));
        System.out.println(checkBalance(new int[]{4,2,8,5,1,7,2,7}));
        System.out.println("������� 7 ����� 1:");
        moveArray_1(new int[]{4,5,8,5,1,7,2},3);
        moveArray_1(new int[]{4,5,8,5,1,7,2},-2);
        System.out.println("������� 7 ����� 2:");       
        moveArray_2(new int[]{1,2,3,4,5,6,7,8},3);
        //moveArray_2(new int[]{4,5,8,5,1,7,2},-3);
	}
	
    //1 ������ ������������� ������, ��������� �� ��������� 0 � 1. ��������: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //� ������� ����� � ������� �������� 0 �� 1, 1 �� 0;
    static void createArr() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("������� 1:");
        for (int i = 0; i < 10; i++ ) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
        for (int i = 0; i < 10; i++ ) {
            switch (arr[i]) {
                case 1: {
                    arr[i] = 0;
                    break;
                }
                case 0: {
                    arr[i] = 1;
                    break;
                }
            }
        }
        for (int i = 0; i < 10; i++ ) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
    }
    
    //2 ������ ������ ������������� ������ �������� 8. � ������� ����� ��������� ��� ���������� 0 3 6 9 12 15 18 21;
    static void createArr8() {
        System.out.println("������� 2:");
        int arr[] = new int[8];
        for (int i = 0; i < arr.length; i++ ) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    //3 ������ ������ [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] ������ �� ���� ������, � ����� ������� 6 �������� �� 2;
    static void changeArr() {
        System.out.println("������� 3:");
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i] == 5)  {
                System.out.print(arr[i] + "  ");
            } else {
                System.out.print(arr[i] + " ");
            }
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++ ) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    //4 ������� ���������� ��������� ������������� ������ (���������� ����� � �������� ����������),
    //� � ������� �����(-��) ��������� ��� ������������ �������� ���������;
    static void createMatrix() {
        int arr[][] = new int[7][7];
        System.out.println("������� 4:");
        for (int i = 0; i < arr.length; i++ ) {
            for (int j = 0; j < arr[i].length; j++ ) {
                if (j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }    
    
	//5 ** ������ ���������� ������ � ����� � ��� ����������� � ������������ �������� (��� ������ ���������);
    static void findMinMax() {
        System.out.println("������� 5:");
        int arr[] = new int[17];
        int min = 30;
        int max = 0;
        for (int i = 0; i < arr.length; i++ ) {
            arr[i] = (int)(Math.random() * 30);
            System.out.print(arr[i] + " ");
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("����������� �������: " + min);
        System.out.println("������������ �������: " + max);
    }
    
    /*6 ** �������� �����, � ������� ���������� �� ������ ���������� ������������� ������, ����� ������ �������
    *true ���� � ������� ���� �����, � ������� ����� ����� � ������ ����� ������� �����.
    *�������: checkBalance([1, 1, 1, || 2, 1]) > true, checkBalance ([2, 1, 1, 2, 1]) > false, checkBalance ([10, || 10]) > true,
    *������� �������� ��������� ||, ��� ������� � ������ �� ������.
    */
    static boolean checkBalance(int arr[]) {
        boolean b;
        int sum_left = 0;
        int sum_right = 0;
        int k = -3;
        for (int i = 0; i < arr.length; i++ ) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();        
        b = false;
        for (int i = 0; i < arr.length; i++ ) {
            sum_left = sum_left + arr[i];
            for (int j = i + 1; j < arr.length; j++ ) {
                sum_right = sum_right + arr[j];                  
            }
            if (sum_left == sum_right) {
                b = true;
                k = i;
            }
            sum_right = 0;
        
        }
        for (int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
            if (k == i ) {
                System.out.print("|| ");
            }
        }
        System.out.println();
        return b;
    }
    
    /*7 **** �������� �����, �������� �� ���� �������� ���������� ������ � ����� n (����� ���� �������������, ��� �������������),
    * ��� ���� ����� ������ �������� ��� �������� ������� �� n. ��� ���������� ������ ������ ������������ ���������������� ���������.
    */
    static void moveArray_1(int arr[], int n) {
        for (int i = 0; i < arr.length; i++ ) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();    
        if (n >= 0) {
            for (int i = arr.length - 1; i >= n; i-- ) {
                arr[i] = arr[i-n];
            }        
            for (int i = 0; i < n; i++ ) {
                arr[i] = 0;
            }
        } else {
            for (int i = 0; i <= arr.length + n - 1; i++ ) {
                arr[i] = arr[i-n];
            }        
            for (int i = arr.length - 1; i > arr.length + n - 1; i-- ) {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static void moveArray_2(int arr[], int n) {
        int temp, temp1;
        for (int i = 0; i < arr.length; i++ ) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        temp1 = arr[n-1];

        for (int k = 1; k <= n; k++) {


            temp = arr[arr.length - k];
            for (int i = arr.length - k; i >= n; i = i - n) {
                arr[i] = arr[i - n];
            }

            if (k == 1) {
                temp1 = arr[n - k];
            }
            if (k == 2) {
                if (arr.length > 3) {
                    arr[k * n - 1] = temp1;
                } else arr[1] = temp1;

            }

            arr[n - k] = temp;

        }

        for (int i = 0; i < arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		