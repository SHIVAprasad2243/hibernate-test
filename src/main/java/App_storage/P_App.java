package App_storage;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class P_App {
@Id
private String p_name;
private int p_price;
private int p_storage;

@ManyToMany
private List<L_App>l;



public List<L_App> getL() {
	return l;
}
public void setL(List<L_App> l) {
	this.l = l;
}
public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}
public int getP_price() {
	return p_price;
}
public void setP_price(int p_price) {
	this.p_price = p_price;
}
public int getP_storage() {
	return p_storage;
}
public void setP_storage(int p_storage) {
	this.p_storage = p_storage;
}



}
