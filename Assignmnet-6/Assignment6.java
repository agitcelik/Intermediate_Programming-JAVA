class Assignment6{//Beginning of the class.
	public int [][] randomTable(int m,int n){//Beginning of the method for generating list randomly.
		int [][] temp= new int[m+1][n];//x+1 add a new row to array I will use it to calculate column average.
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				temp[i][j]=(int)(Math.random()*100);//add value to array from 1 to 100 randomly.
			}
		}
		return temp;// to return our new temp. Array with random table list.
	}//End of the method of generating random list.
	
	public void displayArray(int[][]b){ //Method for printing the 2D array.
		int r=b.length;//to  define length of row.
		int c=b[0].length;//to  define length of column.
		for(int i=0;i<r-1;i++){//I merged row average and display loops.(Beginning of display loop).
			int sum=0;	
			double average=0;	
			for(int j=0;j<c;j++){
				sum=sum+b[i][j];//To add all element  to array.
				b[r-1][j]=b[r-1][j]+b[i][j];//r-1 is seen as normal row number.
				System.out.print(b[i][j]+"\t");//To print the row numbers.	
			}
			average=(double) sum/c;
	
		System.out.printf("%2.2f",average);//Printing two line after and 2 step after decimal point.
		System.out.println();//To pass next line.
		}
		
		//System.out.print("\t"+"\t"+r+"\t");//Printing the row.
		for(int j=0;j<c;j++)
		{
			//System.out.print("\t"+"\t"+b[r-1][j]/(r-1)+"\t");//Printing the row.
			//System.out.print(" \t"+"\t");//To space on the line.
			System.out.printf("%2.2f",(double)b[r-1][j]/(r-1));//Printing two line after and 2 step after decimal point.
			System.out.print(" \t");//To space on the line.
		}
		System.out.println();//To pass next line.
	}//end of the display method.
		
		
	public static void main(String args[]){//beginning of the main method.
		Assignment6 test = new Assignment6();//Creating object to test our array.
		String a= args[0];
		String b= args [1];
	         int rowNumber= Integer.parseInt(a);//We have to  convert String to integer number to get value on compiler.
	         int columnNumber= Integer.parseInt(b);//We have to  convert String to integer number to get value on compiler.
	         test.displayArray(test.randomTable(rowNumber,columnNumber));//To test.          
	}//End of the main method.
}//End of the class.