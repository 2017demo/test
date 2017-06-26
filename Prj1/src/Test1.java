import p6.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,2,3,4,45,6,7,9,8};
		
		
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
		}
		
		// enhanced for loop  ---  array  collections
		for(int x:a){
			System.out.println(x);
		}
		
		
		int b[];
		
		b=new int [5];   ///    0-4
		
		b[0]=100;
		
		
		int twoD[][];
		
		twoD=new int [2][3];
		
		
		Month month;
		month=Month.MAR;
		month.show();
		
		
	}

}
