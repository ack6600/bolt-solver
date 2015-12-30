import java.awt.Dimension;
import java.util.ArrayList;

public class Bolt {
	int[] sides;
	int sOne;
	int sTwo;
	int sThree;
	int sFour;
	int sFive;
	int sSix;
	int type;
	int test;
	public Bolt(int sideNumber)
	{
		Dimension d = new Dimension();
		d.height = 3;
		d.width = 3;
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 1;i<sideNumber+1;i++)
		{
			l.add(i);
		}
		type = 0;
	}
	public Bolt()
	{
		//init just for method use
		type = 2;
	}
	public Bolt(int sideOne,int sideTwo,int sideThree,int sideFour,int sideFive,int sideSix)
	{
		sOne = sideOne;
		sTwo = sideTwo;
		sThree = sideThree;
		sFour = sideFour;
		sFive = sideFive;
		sSix = sideSix;
		type = 1;
	}
	public String getTypeS()
	//returns type in string
	{
		if(type==0)
		{
			return "custom";
		}
		else if (type == 1)
		{
			return "standard";
		}
		else
		{
			return "dummy";
		}
	}
	public int getTypeI()
	//returns type as integer
	//0 is custom 1 is standard
	{
		return type;
	}
	public void print(Bolt b)
	//prints bolt to console if type 1
	{
		if (b.type == 1)
		{
		System.out.println("  "+b.sOne);
		System.out.println(b.sTwo+"   "+b.sSix);
		System.out.println(b.sThree+"   "+b.sFive);
		System.out.println("  "+b.sFour);
		}
		
	}
	//random stuff to test commits 

}
