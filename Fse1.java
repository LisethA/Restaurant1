/*FASE1
 Creeu una variable int per cada un dels bitllets que existeixen des de 5 a 500, haureu de crear un altre
variable per guardar el preu total del menjar. (1 punt)
 Creeu dos arrays, un on guardarem el menú (5 plats) i un altre on guardarem el preu de cada
plat. (1 punt)*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class Fse1 {

	public static void main(String[] args) {
		
		int cash1=5;
		int cash2=10;
		int cash3=20;
		int cash4=50;
		int cash5=100;
		int cash6=200;
		int cash7=500;
		
		int totalPrice=0;
		Boolean plateEat=true;
		
		Scanner sc = new Scanner(System.in);
		 
		 String[] plateFoodmenu = {"1.Seafood--->18€","2.Chicken Wins--->6€","3.Burguer--->8€","4.Spaguettis--->11€","5.Pork Chops--->13€"};
		 ArrayList <String> plateFood= new ArrayList<String>();
		Collections.addAll(plateFood); 
		
	 do {
		 
	   System.out.println("Are you ready to order?" );
	  
		for(int i=0; i<plateFoodmenu.length; i++)
			
		System.out.println(plateFoodmenu[i]);
		
		String plate = sc.next();
		
		plateFood.add(plate);
		
		System.out.println("Have you finished?");
		String order = sc.next();
		
		if(order.equals("yes")) {
		    plateEat=true;
		}
		    else if(order.equals("no")) {
		       plateEat=false;
		    }
	}while(!plateEat);
            System.out.println(plateFood);
	
	for (String i : plateFoodmenu) {
		 System.out.println(i);
	}
	}
}

	