package NuralPKG;

import java.util.Comparator;

public class VersionComparator implements Comparator {
	


	

	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		BeanClass bp1 = (BeanClass) arg0;
		BeanClass bp2 = (BeanClass) arg1;
		return bp1.Total_Versions.compareTo(bp2.Total_Versions);
		  
		 
		
	}

}
