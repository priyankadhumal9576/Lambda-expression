
public class Main2 {

	public static void main(String[] args)
	{
		Operate o=(x,y)->{return x*y;};
		System.out.println(o.doMultiplication(2, 10));
	
		Operate o1=(x,y)->{return (x*y+x);};
		System.out.println(o1.doMultiplication(20, 10));
		
		Operate o3=(x,y)->{return x*x+y*x+y;};

		System.out.println(o3.doMultiplication(5,6));
	}

}
