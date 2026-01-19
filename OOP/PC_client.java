package OOP;

public class PC_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		making an object of P class in PC_client by the reference variable name-obj
		//CASE 1
//		P obj= new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d2);
//		obj.fun();
//		obj.fun2();
		
		
		//CASE 2
//		P obj2 = new C();
//		System.out.println(obj2.d);
//		System.out.println(obj2.d2);
////		System.out.println(obj2.d1); //ERROR
//		System.out.println(((C) (obj2)).d1);
//		System.out.println(((C) (obj2)).d);
//		
//		obj2.fun();//METHOD OVERRIDING- during runtime, method is accessed of the class creating object
//		obj2.fun2();    //fun2 is not their in C class, then it see the P class, which has this method
//		((C)(obj2)).fun1();  //type-casting for compiler
		
		
		//CASE 3
		//this case is not allowed
//		C obj3= new P();
//		System.out.println(obj3.d);
//		System.out.println(obj3.d2);
//		System.out.println(obj3.d1);
		
		
		//CASE 4
		C obj4= new C();
		System.out.println(obj4.d); //1
		System.out.println(((P)(obj4)).d); //1
		System.out.println(obj4.d1);  //10
		System.out.println(obj4.d2); //20
		
		obj4.fun(); //c
		obj4.fun1();  //c
		obj4.fun2(); //p
		((P)(obj4)).fun(); //this will still be c- because object is of C

	}

}
