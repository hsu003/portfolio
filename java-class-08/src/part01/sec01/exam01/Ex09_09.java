package part01.sec01.exam01;

public class Ex09_09 {

	public static void main(String[] args) {
		String str1="Java Programming";
		String str2="Java Programming";   //���� ���ڿ��� ���� �������� �ʰ� ������ �ִ� ���� ����
		String str3= new String("Java Programming");
		
		System.out.println("�� ���ڿ�1==>["+str1+"]");
		System.out.println("�� ���ڿ�2==>["+str2+"]");
		System.out.println("�� ���ڿ�3==>["+str3+"]\n");
		
		System.out.println("���ڿ�1==���ڿ�2 ��� : \t"+(str1==str2));
		System.out.println("���ڿ�1.equals(���ڿ�2) ���:"+str1.equals(str2));     //equals ���ڿ��� ������ �ִ� ���� ���� �Ի��Ѵ�.
		System.out.println("���ڿ�1==���ڿ�2��� :       " + (str1==str3));
		System.out.println("���ڿ�1.equals(���ڿ�3) ��� :"+str1.equals(str3));
	}

}