import java.io.File;//To use file tools we have to import java io File.
import java.io.FileNotFoundException;//To get rid of not founding any file exception, we have to import java io FileNotFoundException.
import java.io.FileWriter;//To write data to a file, we have to import java io FileWriter.
import java.io.IOException;//To get rid of some exceptions with try catch block we have to import java io IOException.
import java.io.PrintWriter;//To print data to a file, PrintWriter class must be imported.
import java.util.Scanner;//To get data from users and also to read data from a file, Scanner class should be defined.

public class AverageAndStandardDeviation {//Beginning of the class.
	public static double sum =0.0;//To get rid of defining sum over and over, static method could be used.
	public static int counter =0;//To get rid of defining counter over and over, static method could be used.
	
	public double numberOfAverage() throws IOException{//To get rid of IOExceptio. Throws keyword can be merely used.
		sum=0;//due to static method any data type will not be written.	And must be initialized to use for some	calculation.
		counter=0;//due to static method any data type will not be written.	And must be initialized to use for some	calculation.
		File file = new File("data.txt");//Creating a data.txt file.
		File file1 = new File("result.txt");//Creating a result.txt file.
		try{								 
			FileWriter fw = new FileWriter(file);//Writing data from file.
			PrintWriter pw = new PrintWriter(fw);//Printing written data from file.
			FileWriter fw1 = new FileWriter(file1);//Writing data from file.
			PrintWriter pw1 = new PrintWriter(fw1);//Printing written data from file.

			for(double i = 12.5; i<=15.5; i++){//Write and print number from to  15.5 as our choices. 
				pw.println(i);//Printing number that our choices.
				sum = sum+i;//TO sum all of values of i.
				counter++;//Counting number every in every loop.
				}
				double average= sum/counter;//gives us average.
				pw1.println("The avarage of numbers <in data.txt> is "+average);//printing average.
		}
		catch(FileNotFoundException e){//if any error will be occur, error can be thrown with some messages in catch block.
			System.out.println(e.getMessage());
		}
		return sum/counter;//gives us average.
	}//End of the numberOfAverage() method.

	public void writeData(){//Beginning of the method.
		File file = new File("data.txt");//Creating a data.txt file.
		File file1 = new File("result.txt");//Creating a result.txt file.
		try{								
			FileWriter fw = new FileWriter(file);//Writing data from file.
			PrintWriter pw = new PrintWriter(fw);//Printing written data from file.
			FileWriter fw1 = new FileWriter(file1);//Writing data from file.
			PrintWriter pw1 = new PrintWriter(fw1);//Printing written data from file.
			sum =0.0;//must be initialized.
			double sum1=0.0;//must be initialized.
			counter=0;//must be initialized.
			for(double i = 12.5; i<=15.5; i++){//Write and print number from to  15.5 as our choices. 
			pw.println(i);
			sum = sum+i;//To sum all of values of i.
			counter++;//Counting number every in every loop.
			}
			double average= sum/counter;//gives us average.
			for(double j = 12.5; j<=15.5; j++){//Write and print number from to  15.5 as our choices. 
				double x=j-average;
				sum1=sum1+x*x;
			}
			double standardDeviation =(sum1/(counter-1))*(sum1/(counter-1));//gives us standard deviation.
			
			pw1.println("The Avarage of numbers: <in data.txt> is "+numberOfAverage());//Printing average of numbers from data.txt.
			pw1.printf("The Standard deviation of numbers <in data.txt> is %.2f",standardDeviation);//Printing standard deviation of numbers from data.txt.
			pw1.close();//To close result.txt file
			pw.close();//To close data.txt file.
			
			}catch(IOException e){//if any error will be occur, error can be thrown with some messages in catch block.
				System.out.println("Error");//Printing the error messages.
				System.out.println(e.getMessage());//e.getMessage gives us what is the error is.
			}
	}//End of the writeData() method.
	
	public void readData() throws FileNotFoundException{//To get rid of FileNotFoundException. Throws keyword can be merely used.
	     Scanner scan = new Scanner (new File("data.txt"));//To read data from a file.

	        while(scan.hasNextLine()){//To pass and read next line of code if there is any code there.
	        String s = scan.nextLine();//Initialize with type as a String.
	        try {//Code will be tried to execute there, if any error occurs then try block passes from try to catch.
	         double   d = Double.parseDouble(s);//Since, written data was double, we have to convert String to double to read it.
	            System.out.println("The number in the file in data.txt is(as a double)= " + d);//To read doubles.
	        } catch (NumberFormatException e1) {//if any error will be occur, error can be thrown with some messages in catch block.
	            System.out.println(s+ " is not a Double number");//if the given number that is in file is not type of double, this message prints out to console.
	        }//End of the catch block.       
	    }
	}//End of the readData() method.
	public static void main(String[] args) throws FileNotFoundException {//To get rid of FileNotFoundException. Throws keyword can be merely used.
		AverageAndStandardDeviation test= new AverageAndStandardDeviation();//Creating a object to test our methods.
		test.writeData();//Testing writeData() method.
		test.readData();//Testing readData() method.
		System.out.println("(In result.txt you can see the result that are average and of numbers and standard deviations)");
		System.out.println("End of the program...");
	}//End of the method.
}//End of the class.
