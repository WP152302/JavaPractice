/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ PersonTest2
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 10.
 * </pre>
 * 
 * @author 권두영
 * @version : 1.0
 */
public class PersonTest2 {

	private static void greeting(Person p){
		System.out.println(p);
		p.sayHello();
		p.sayBye();
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Person[] p = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나까"),
				new Chinese("왕밍")
		};
		
		for(Person p1 : p){
			greeting(p1);
		}
	}
}