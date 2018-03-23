package NuralPKG;

import java.util.Comparator;



public class NameComparator  implements Comparator {
	
	  private final String keyWord;

	  public NameComparator(String keyWord) {
          this.keyWord = keyWord;
      }

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		BeanClass bp1 = (BeanClass) arg0;
		BeanClass bp2 = (BeanClass) arg1;
		  if(bp1.Name.startsWith(keyWord)) {
              return bp2.Name.startsWith(keyWord)? bp1.Name.compareTo(bp2.Name): -1;
          } else {
              return bp2.Name.startsWith(keyWord)? 1: bp1.Name.compareTo(bp2.Name); 
          }
		
		 
		
	}

}
