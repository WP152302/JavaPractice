/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 	|_ Operator
 * 
 * 1. 개요 : 대한민국 커피 전문점 매출1위 디미베네으 연간 인건비를 계산해보자.
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 * 
 * @author 권두영
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			System.out.println("<<디미베네 연간 인건비>>");
			
			int a = 1700000;
			System.out.printf("월 평균 급여 : %,d원\n", a);
			int b = 3;
			System.out.printf("점포 내 직원 수 : %d명\n", b);
			int c = 1500;
			System.out.printf("점포 수 : %,d개\n\n\n", c);
			System.out.printf("연간 인건비 : %,d원",(long)a*b*12*c);
	}

}
