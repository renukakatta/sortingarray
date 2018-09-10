public class sortingarray {

	public static void main(String[] args) {
		int []a={23,89,60,56,12,80};
		int []b;
		b= merge(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]+",");
	}
	}
public static int[] merge(int d[])
{
	//int d[]=new int[a.length];
	for(int i=0;i<(d.length/2)-1;i++)
	{
		for(int j=i+1;j<(d.length/2);j++){
	if(d[i]<d[j])
	{
		int temp=d[i];
		d[i]=d[j];
		d[j]=temp;
	}
		}
	}
	for(int i=(d.length/2);i<d.length;i++)
	{
	for(int j=i+1;i<d.length-1;i++){
		
		if(d[i]>d[j])
		{
			int temp=d[i];
			d[i]=d[j];
			d[j]=temp;
		}
	}
	}
return d;
}

}