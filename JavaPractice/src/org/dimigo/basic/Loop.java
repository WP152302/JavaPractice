/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 * 	|_ Loop
 * 
 * 1. 개요 : 조건문과 반복문을 이용하여 초간단 게임 프로그램을 작성해보자!
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 * 
 * @author 권두영
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		int a = 100;
		String[] job = {"마법사", "영주", "기사", "농민"};
		
		do {
			System.out.println("-------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("-------------");
			System.out.println("메뉴 입력 => ");
		
			choice = scanner.nextInt();
		
			switch (choice) {
			case 1 :
				System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n",a+10);
				break;
			case 2 :
				System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n",a-10);
				break;
			case 3 :
				int num = new Random().nextInt(4);
				System.out.println(job[num]+"(으)로 설정되었습니다.");
				break;
			case 9 :
				System.out.println("이제 공부하세요!");
				scanner.close();
				break;
			default :
				System.out.println("없는 메뉴입니다!!");
			}
		} while (choice != 9);
	}
}
