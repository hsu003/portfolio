package part01.sec01.exam01;

public class Ex04_06 {

	public static void main(String[] args) {
		int a=99;
		
		System.out.printf("AND ����:%s\n",(a>=100)&&(a<=200));  //AND�� �ϳ��� false�� �������� true���� false�� �ȴ�
		System.out.printf("OR ����:%s\n",(a>=100)||(a<=200));  //OR�� �ϳ��� false�� ���ӱ�� true���� true�� �ȴ�.
		System.out.printf("NOT ����:%s\n",!(a==100));
	}

}