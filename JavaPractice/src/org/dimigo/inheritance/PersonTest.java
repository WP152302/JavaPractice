/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.ingeritance
 * 	|_ PersonTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 26.
 * </pre>
 * 
 * @author 권두영
 * @version : 1.0
 */
public class PersonTest {
	
	public static void main(String[] args) {
		Person a= new Person("Tom");
		Korean k =new Korean("홍길동");
		Chinese c = new Chinese("왕밍");
		Japanese j = new Japanese("다나까");
		System.out.println(a);
		System.out.println(k);
		System.out.println(c);
		System.out.println(j);
		System.out.println();
		a.sayHello();
		k.sayHello();		
		c.sayHello();
		j.sayHello();
		System.out.println();
		a.sayBye();	
		k.sayBye();
		c.sayBye();	
		j.sayBye();
	}

}