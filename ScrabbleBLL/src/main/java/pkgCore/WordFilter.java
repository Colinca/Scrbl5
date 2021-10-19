package pkgCore;

public class WordFilter 
{
	private String strStartWith;
	private String strEndWith;
	private String strContains;
	private int iContainsidx;
	private int iLength;
	
	public WordFilter()
	{
		
	}
	
	public String getStrStartWith()
	{
		return strStartWith;
	}
	
	public void setStrStartWith(String start)
	{
		this.strStartWith = start;
	}
	
	public String getStrEndWith()
	{
		return strEndWith;
	}
	
	public void setStrEndWith(String end)
	{
		this.strEndWith = end;
	}
	
	public String getStrContains()
	{
		return strContains;
	}
	
	public void setStrContains(String contain)
	{
		this.strContains = contain;
	}
	
	public int getiLength()
	{
		return iLength;
	}
	
	public void setiLength(int length)
	{
		this.iLength = length;
	}
	
	public int getiContainsIdx()
	{
		return iContainsidx;
	}
	
	public void setiContains(int idx)
	{
		iContainsidx = idx;
	}
}
