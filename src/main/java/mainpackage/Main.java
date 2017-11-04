package mainpackage;

/* Zadání:
 * Vytvořit vlastní kolekci objektů v Listu. Tuhle kolekci projít a 
 * jako json formát uložit do souboru pomocí commons-io knihovny (maven) 
 * a utils metod v ní
 */

public class Main {

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
		
		for (Ware w: wareHouse.getListProductsWareHouse()) {
			System.out.println(w.getNameWare()+", "+w.getMinimumAmountWare()+", "+w.getCurrentAmountWare());
		}
		
		
		
		

	}

}
