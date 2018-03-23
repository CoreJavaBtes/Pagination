package NuralPKG;

import java.util.Comparator;

public class OSComparator implements Comparator {
	


	

	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		BeanClass bp1 = (BeanClass) arg0;
		BeanClass bp2 = (BeanClass) arg1;
		return bp1.Operating_system.compareTo(bp2.Operating_system);
		  
		 
		
	}

}
