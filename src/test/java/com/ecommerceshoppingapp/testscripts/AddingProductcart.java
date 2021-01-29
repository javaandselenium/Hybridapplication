package com.ecommerceshoppingapp.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.Shoppingapp.pom.pages.Addtocart;
import com.Shoppingapp.pom.pages.Home;
import com.Shoppingapp.pom.pages.Login;
import com.Shoppingapp.pom.pages.Product;

import genericlibraryShoppingapp.Baseclass;
import genericlibraryShoppingapp.PropertyFile;
import genericlibraryShoppingapp.Utilies;

public class AddingProductcart extends Baseclass {
	@Test
	public void addingcart() throws FileNotFoundException, IOException {
		Login l=new Login(driver);
		l.loginCredtial(PropertyFile.getpropertyfiledata("email"),PropertyFile.getpropertyfiledata("password"));
	
		Home h=new Home(driver);
		h.productSerach(PropertyFile.getpropertyfiledata("productname"));
	
		Product p=new Product(driver);
		Utilies.dropDown(p.getSerachdd(),PropertyFile.getpropertyfiledata("sortby"));
		p.dressimg();
		
		Addtocart a=new Addtocart(driver);
		a.plusbutton();
		Utilies.dropDown(a.getSizedd(),PropertyFile.getpropertyfiledata("sizedd"));
		a.addingtocart();
	}

}
