package sevenPractice;

import java.util.Scanner;
public class seven_17 {
	private String name;
	private long grade;
	public long getGrade() {
	return grade;
	}
	public void setGrade(long grade) {
	this.grade = grade;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String toString(){
	return this.name;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("������ѧ����");
	int stuNumT = sc.nextInt();
	seven_17 objArr[] = new seven_17[stuNumT];
	for(int i = 0; i < objArr.length; i++){
	objArr[i] = new seven_17();
	System.out.println("�������" + (i+1) + "��ѧ��������");
	String name = sc.next();
	objArr[i].setName(name);
	System.out.println("�������" + (i+1) + "��ѧ���ĳɼ�");
	long grade = sc.nextLong();
	objArr[i].setGrade(grade);
	}
	System.out.println("��ӡ��ʼ:");
	for(int i = 0; i < objArr.length; i++){
	for(int j = i+1; j < objArr.length; j++){
	if(objArr[i].getGrade() < objArr[j].getGrade()){
	seven_17 s = new seven_17();
	s = objArr[i];
	objArr[i] = objArr[j];
	objArr[j] = s;
	}
	}
	}
	for(int i=0; i < objArr.length; i++){
	System.out.println(objArr[i].getName()+"�ĳɼ��ǣ�"+objArr[i].getGrade());
	}
	}
  
}
