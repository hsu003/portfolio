package part01.sec01.exam01;

public class Ex09_06 {

	public static void main(String[] args) {
		String str = " �ѱ� ABCD efgh ";
		
		System.out.println("�� ���ڿ� ==>["+str+"]");
		System.out.println("�빮�ڷ� ==>["+str.toUpperCase()+"]");
		System.out.println("�ҹ��ڷ� ==>["+str.toLowerCase()+"]");
		System.out.println("�������� ==>["+str.trim()+"]");
		System.out.println("��� ���� ���� ==>["+str.replaceAll(" ", " ")+"]");
	}

}