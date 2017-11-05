package mainpackage;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.*;
//import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;




/* Zadáno:
 * Vytvořit vlastní kolekci objektů v Listu. Tuhle kolekci projít a 
 * jako json formát uložit do souboru pomocí commons-io knihovny (maven) 
 * a utils metod v ní
 */

public class Main {

	public static final String NAME_OUTPUT_FILE_NAME = "OUTPUT.TXT";
	
	public static final File outputFileName = new File(NAME_OUTPUT_FILE_NAME);
	
	public static final String APPLICATION_CODE_PAGE = "UTF-8"; 
	
	
	public static void main(String[] args) {
		
		/* vytvoření kolekce objektů v Listu: */
		WareHouse wareHouse = new WareHouse("Warehouse of food");
		Ware ware = new Ware("milk", 10, 1250);
		wareHouse.getListProductsWareHouse().add(ware);
		Ware ware2 = new Ware("chees", 9, 1145);
		wareHouse.getListProductsWareHouse().add(ware2);
		Ware ware3 = new Ware("beef", 7, 1187);
		wareHouse.getListProductsWareHouse().add(ware3);
		Ware ware4 = new Ware("butter", 18, 1450);
		wareHouse.getListProductsWareHouse().add(ware4);
		Ware ware5 = new Ware("vegetable butter", 18, 1111);
		wareHouse.getListProductsWareHouse().add(ware5);
		Ware ware6 = new Ware("orange", 22, 2222);
		wareHouse.getListProductsWareHouse().add(ware6);
		Ware ware7 = new Ware("potatoes", 33, 4444);
		wareHouse.getListProductsWareHouse().add(ware7);
		Ware ware8 = new Ware("rice", 14, 5214);
		wareHouse.getListProductsWareHouse().add(ware8);
		Ware ware9 = new Ware("pork", 11, 2489);
		wareHouse.getListProductsWareHouse().add(ware9);
		
		Gson gson = new Gson();
		String json = gson.toJson(wareHouse.getNameOfWareHouse());
		System.out.println(json);
		
		
		try {
			
			FileUtils.writeStringToFile(outputFileName, json, APPLICATION_CODE_PAGE, false);
		} catch (IOException e) {
			System.out.println("Chyba zápisu do souboru");
			e.printStackTrace();
		}
		
		for (Ware w: wareHouse.getListProductsWareHouse()) {
			json = gson.toJson(w);
			System.out.println(json);
			/*	System.out.println(w.getNameWare()+", "+w.getMinimumAmountWare()+", "+w.getCurrentAmountWare());*/
			try {
				FileUtils.writeStringToFile(outputFileName, json, APPLICATION_CODE_PAGE, true);
			} catch (IOException e) {
				System.out.println("Chyba zápisu do souboru2");
				e.printStackTrace();
			}
			
		}
		
		
		
		

	}

}
