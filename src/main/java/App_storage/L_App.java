package App_storage;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class L_App {
@Id
private String l_name;
private int l_Storage;
private int l_price;

@ManyToMany(mappedBy = "l")
private List<P_App>p;

public String getL_name() {
	return l_name;
}

public void setL_name(String l_name) {
	this.l_name = l_name;
}

public int getL_Storage() {
	return l_Storage;
}

public void setL_Storage(int l_Storage) {
	this.l_Storage = l_Storage;
}

public int getL_price() {
	return l_price;
}

public void setL_price(int l_price) {
	this.l_price = l_price;
}

public List<P_App> getP() {
	return p;
}

public void setP(List<P_App> p) {
	this.p = p;
}


	
	
	
}
