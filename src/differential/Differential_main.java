package differential;

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("input value of a > ");
		double a = Double.parseDouble(scan.next());
		System.out.print("input value of h > ");
		double h = Double.parseDouble(scan.next());
		
		Differential_lib dlib = new Differential_lib(a,h);
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getRx());
		System.out.println("f(x)=x^2��x="+a+"�ɂ����鐔�l������"+dlib.getDx());
		System.out.println("h = "+h+"�ɂ����鑊�Ό덷��"+dlib.getGosa());
		
		
		//h=0.00000001�̂Ƃ����Ό덷����ԏ������Ȃ����B
	}

}
