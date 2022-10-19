package com.xworkz.copy.boot;
import com.xworkz.copy.examples.*;

public class MedicalRunner {

	public static void main(String[] args) {
		String[]colours= {"green","white","brown","blue"};
		String[]wnames= {"manu","om","prashant","jai"};
		String[]coco= {"peark","Dairymilk","milkbar"};
		String[]tab= {"mygrane","cinarest","dolo650","gastro"};
		String[]syp= {"cinarest","cheston","zikuss"};
		int[]earning= {10200,12500,25600,30060,20900,30300};
	  Medical medical =new Medical("mata",155,"BasaveshwarNagar",9999999999L,"Basava", colours, wnames, coco, tab, syp, earning);
	  medical.prescription();
	}

}
