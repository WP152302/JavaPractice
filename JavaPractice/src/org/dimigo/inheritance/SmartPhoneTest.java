/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 * 
 * @author 권두영
 * @version : 1.0
 */
public class SmartPhoneTest {
	
	    public static void main(String args[]) {
	 
	    	SmartPhone[] smartPhone = new SmartPhone[] {
	             new IPhone("iPhone 7","애플",900000),
	             new Galaxy("갤럭시 S8","삼성",800000),
	        };
	         
	    for(int i=0; i<2; i++) {
	        System.out.println(smartPhone[i]);
            smartPhone[i].turnOn();
            smartPhone[i].pay();
            smartPhone[i].useSpecialFunction(smartPhone[i]);
            smartPhone[i].turnOff();
            System.out.println();
        }
    }
}
