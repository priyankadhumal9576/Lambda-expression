
public class LamdaExpression 
{
  public static void main(String[]arg)
  {
	  ReadBooks r=(bookName)->{System.out.println(bookName);};
	  r.doRead("yayati");
	  ReadBooks.scipt();
  }
}
