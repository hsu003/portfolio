package prat01.sec01.exam01;

public class Ex06_07 {

	public static void main(String[] args) {
		int i;
		int hap=0;      //�ڹٴ� ���� �����ϰ� �ʱⰪ ���ָ� ������ ����.
		//hap=1+2+3+4+5+6+7+8+9+10;
		//int sum=0;
		for(i=1;i<=10;i++) {     //���� ���� ��ų��쿡�� ������ ���� �ʱ�ȭ ���Ѿ� �Ѵ�.
			hap=hap+1;
			//sum = sum +i;
			//System.out.printf("1���� 100������ �� : \n"+sum);
		}
		System.out.printf("1���� 10������ �� :%d \n",hap);

	}

}