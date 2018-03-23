package OOPs;

public class dEMOmETHODS {
	
	int var = 200;
	//with parameter lis, with return type
	
	float Addition(int x, float y)
	{
		float res = x+y;
		return res;
	}
	
	void mul(int x, int y){
		int res = x*y;
		
		System.out.println("Result3 ::"+res);
	}
	
	int sub(){
	int res = var*var;	
		return res;
	}
	
	void add()
	{
		System.out.println("result4 :: "+var);
	}
	public static void main(String[] args) 
	{
		
		dEMOmETHODS obj = new dEMOmETHODS();
		
		float var1 = obj.Addition(12, 30);
		obj.mul(33,67);
		int var2=obj.sub();
		obj.add();
		
		System.out.println("First Result ::"+ var1);
		System.out.println("2nd Result ::"+ var2);
		
	}

}























