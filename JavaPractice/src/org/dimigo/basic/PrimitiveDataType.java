/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 	|_ PrimitiveDataType
 * 
 * 1. 개요 : 아이유 프로필 출력하기
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 * 
 * @author 권두영
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			System.out.println("<<아이유 프로필>>");
		String name = "아이유";
			System.out.println("이름 : " + name);
		boolean flag = false;
			System.out.println(flag ? "성별 : 남자" : "성별 : 여자");
		int age = 25;
			System.out.printf("나이 : %d세\n", age);
		double height = 161.8;
			System.out.print("키 : "+ height);
			System.out.println("cm");
		float weight = 44.3f;
			System.out.print("몸무게 : " + weight);
			System.out.println("kg");
		char bloodtype = 'A';
			System.out.print("혈액형 : " + bloodtype);
			System.out.println("형");
	}

}
