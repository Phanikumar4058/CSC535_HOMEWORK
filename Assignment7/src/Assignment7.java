import java.util.Scanner;

public class Assignment7 {
	public static void main(String[] args) 
	{
		Scanner inputData = new Scanner(Assignment7.class.getResourceAsStream("InputFile.data"));
      
		
	while(inputData.hasNextLine())
		{
		String line = inputData.nextLine();
		
		
		if(line.contains("<"))
		{
			line = line.replaceAll("<", "");
			line = line.replaceAll(">", "->");
			 String[] run = line.split("/");
			 
			 line= run[0];
		}
		
		System.out.println(line);
		}
	}
}
