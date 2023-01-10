package org.methods5.methods2;

import org.methods5.methods.AccessModifier;
import org.methods5.methods.SubAccessMofierf;

public class Methods2 {


	public static void main(String[] args) {

		var temp = new AccessModifier("adas", "dq", "wedqw");
		//		System.err.println(temp.defaultName);
		var subclass = new SubAccessMofierf("wqw", "eqeq", "qwdeqw");


//		System.err.println(subclass.rotedtedNmee);
//		System.err.println(subclass.mame);
//		System.err.println(subclass.defaultName);


		var demeprotect = new denemeProtected("qwedq", "2e1q2", "3123");


		System.err.println(demeprotect.publictry);
		// protected only can be used in class  !!!!!!!!!!!!

//		System.err.println(demeprotect.protectedName);

	}


}


// protected only can be used in class  !!!!!!!!!!!!


class denemeProtected extends AccessModifier {


	public void denemeforprotedt() {
///  Usage of protectedd
		System.err.println(protectedName);

	}


public void  classOfownProtedcted() {

AccessModifier asd=new AccessModifier("wdq","1dqw","12");

		System.err.println(asd.publictry);

		// own class also CAN NOT USE PROTEDTECT !!!!!
//		System.err.println(asd.protectedName);


	}

public void insideClass(){



//		WOWWWW, İT USES PROTECTED, BUT OWN CLASS CAN NOT
		denemeProtected fff=new denemeProtected("qw","31","2e12");
	System.err.println(fff.protectedName);
	System.err.println(fff.publictry);

}

	public denemeProtected(String rotedtedNmee, String mame, String defaultName) {
		super(rotedtedNmee, mame, defaultName);
	}
}





class LastCondition{


	void sdf(){

		denemeProtected fff=new denemeProtected("qw","31","2e12");
// wwowww , it can not also use protected

//		System.err.println(fff.protectedName);
		System.err.println(fff.publictry);



	}


}