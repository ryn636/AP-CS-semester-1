package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
		String name;
		int age; 
		String breed;
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	
	public Dog(String name) {
		this.name = name;
		age = 1;
		breed = "dog dog";
	}
	
	public Dog(String name, String breed) {
		this.name = name;
		age = 1;
		this.breed = breed;
	}
	
	public Dog(String name, int age){
		this.name = name;
		this.age = age;
		breed = "dog dog";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setBreed(String breed){
		this.breed = breed;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getBreed(){
		return breed; 
	}
	
	public boolean isSleeping() {
		int slep = (int)(Math.random()*2 +1);
		if (slep == 1) {
			return true;
		} else{
			return false;
		}
	}
	
	public void bark() {
		System.out.println(getName()+" Barks!");
	}
}//
