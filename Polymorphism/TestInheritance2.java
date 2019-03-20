package JavaBasics;


class Animal{  
	void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
	void bark(){System.out.println("barking...");}  
	void eat(){System.out.println("yum...");}  
}  
class BabyDog extends Dog{  
	void weep(){System.out.println("weeping...");}   
	void eat(){System.out.println("nursing...");}  
}


class TestInheritance2{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  

Dog myDog = d;
Animal myAnimal = d;

myDog.eat();
myAnimal.eat();
}}  
