package NinePractice;

import java.util.Scanner;

public class nine_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入第一条线段的两个端点: ");
		System.out.print("x1=");
		int x1 = input.nextInt();
		
		System.out.print("y1=");
		int y1 = input.nextInt();
		
		System.out.print("x2=");
		int x2 = input.nextInt();

		System.out.print("y2=");
		int y2 = input.nextInt();

		System.out.println("输入第二条线段的两个端点: ");
		System.out.print("x3=");
		int x3 = input.nextInt();

		System.out.print("y3=");
		int y3 = input.nextInt();

		System.out.print("x4=");
		int x4 = input.nextInt();

		System.out.print("y4=");
		int y4 = input.nextInt();
		
		int a = (y1 - y2);
		int b = (-x1 + x2);
		int e = -y1 * (x1 - x2) + (y1 - y2) * x1;
		int c = (y3 - y4);
		int d = (-x3 + x4);
		int f = -y3 * (x3 - x4) + (y3 - y4) * x3;

		LinearEquation1 equation = new LinearEquation1(a, b, c, d, e, f);

		if (equation.isSolvable()) {
			System.out.println("线段的交点是: (" +equation.getX() + ", " + equation.getY() + ")"); 
		}
		else {
			System.out.println("这两条线段无交点！ ");
		}
		class LinearEquation1{

		int a,b,c,d,e,f;

		LinearEquation1(int a,int b,int c,int d,int e,int f){
			this.a=a;
			this.b=b;
			this.c=c;
			this.d=d;
			this.e=e;
			this.f=f;
			}

			int getA(){

			return a;

			}

			int getB(){

			return b;

			}

			int getC(){

			return c;

			}

			int getD(){

			return d;

			}

			int getE(){

			return e;

			}
			int getF(){

			return f;

			}
			
			boolean isSolvable(){

				return a*d-b*c!=0?true:false; 
				}

				int getX(){

				return (e*d-b*f)/(a*d-b*c); 
				}

				int getY(){

				return (a*f-e*c)/(a*d-b*c);

				}				
		}
	}
}

				

		

				
			
		















