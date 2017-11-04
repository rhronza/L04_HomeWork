package mainpackage;

import java.util.ArrayList;
import java.util.List;

/* skladiště */
public class WareHouse {
	
	/* konstruktor */
	public WareHouse(String nameOfWareHouse) {
		this.nameOfWareHouse= nameOfWareHouse;
	}
	
	/* název skladu */
	private String nameOfWareHouse;
	
	/*seznam zboží na skladu */
	private List<Ware> listProductsWareHouse= new ArrayList<Ware>();

	public String getNameOfWareHouse() {
		return nameOfWareHouse;
	}

	public void setNameOfWareHouse(String nameOfWareHouse) {
		this.nameOfWareHouse = nameOfWareHouse;
	}

	public List<Ware> getListProductsWareHouse() {
		return listProductsWareHouse;
	}

	public void setListProductsWareHouse(List<Ware> listProductsWareHouse) {
		this.listProductsWareHouse = listProductsWareHouse;
	}
}
