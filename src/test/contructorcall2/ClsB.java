package test.contructorcall2;

public class ClsB extends ClsA {

	public ClsB() {
		System.out.println("ClsB() �⺻ ������ ����");
	}
	
	public ClsB(int n) {
		super(n);
		System.out.println("ClsB(int n) ������ ���� : "+ n);
	}
}
