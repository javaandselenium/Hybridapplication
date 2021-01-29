package com.ecommerceshoppingapp.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.Shoppingapp.pom.pages.EveningDress;
import com.Shoppingapp.pom.pages.Home;
import com.Shoppingapp.pom.pages.Login;

import genericlibraryShoppingapp.Baseclass;
import genericlibraryShoppingapp.PropertyFile;
import genericlibraryShoppingapp.Utilies;

public class DeliveryProduct extends Baseclass{
	@Test
	public void productdeliver() throws FileNotFoundException, IOException {
		Login l=new Login(driver);
		l.loginCredtial(PropertyFile.getpropertyfiledata("email"),PropertyFile.getpropertyfiledata("password"));
		
		Home h=new Home(driver);
		Utilies.mouseHover(driver,h.getDresstab());
		h.eveningdree();
		
		EveningDress e=new EveningDress(driver);
		e.deliveryproduct();
		
	}
	

}
