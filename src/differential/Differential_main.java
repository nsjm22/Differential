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
		System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.getRx());
		System.out.println("f(x)=x^2のx="+a+"における数値微分は"+dlib.getDx());
		System.out.println("h = "+h+"における相対誤差は"+dlib.getGosa());
		
		
		//h=0.00000001のとき相対誤差が一番小さくなった。
	}

}
