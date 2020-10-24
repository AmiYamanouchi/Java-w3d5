import java.util.Scanner;


public class Driver {

	//method to print just one object which pass as an argument
	public static void printSingerInformation(Record temp) {
		System.out.println("singer ID: " + temp.getId() +
						   "\nRecord Title: " + temp.getRecordTitle()+
						   "\nSinger name: " + temp.getSingerName() +
						   "\nrecords length: " + temp.getRecordLength() +
						   "\nRecord Ranking: " + temp.getRecordRanking());
	}
	
	//method to iterate through the array and find the index of record for the title
		//- return the index of record if we don't have it ---> return -1
	public static int findIndexOfRecord(Record[] singer, String recordTitle) {
		
		for(int i = 0; i < singer.length; i++) {
			if(singer[i].getRecordTitle().equalsIgnoreCase(recordTitle)) {
				return i;
			}
		}
		return -1;
	}
	
	//getAverage of lengthRecord  ---> return average
	public static double getAverageOfLengthRecord(Record[] records) {
		double sum = 0;
		for(int i = 0; i < records.length; i++) {
			sum += records[i].getRecordLength();
		}
		return sum / records.length;
	}
	
	//getAverage of ranking  ---> return average
	public static double getAverageOfRanking(Record[] records) {
		double sum = 0;
		for (int i = 0; i < records.length; i++) {
			sum += records[i].getRecordRanking();
		}
		return sum / records.length;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// at least create 5 objects
		
		Record singer1 = new Record("Dynamite", "BTS", 120.0, 5);
		Record singer2 = new Record("Lover", "Taylor.S", 123.2, 1);
		Record singer3 = new Record("Good Day", "Michael.J", 124.3, 2);
		Record singer4 = new Record("I love you", "Cody.W", 125.2, 4);
		Record singer5 = new Record("Good-bye", "Andy.S", 126.1, 3);
		
		//create array and add these object to array
		
		Record[] singer = new Record[5];
		singer[0] = singer1;
		singer[1] = singer2;
		singer[2] = singer3;
		singer[3] = singer4;
		singer[4] = singer5;
		
		//ask the user to enter the title of record
		
		System.out.println("enter the title of record");
		
		//read the input
		String recordTitle = input.next();
		
		//findRecord
		int index = findIndexOfRecord(singer, recordTitle);

		
		if(index == -1) {
			System.err.println("we don't have " + recordTitle);
		} else {
			System.out.println("Index is " + index);
		}
		
		//print the record
		printSingerInformation(singer1);
		
		
		//print the averages
		
		System.out.println("The average of length is " + getAverageOfLengthRecord(singer));
		System.out.println("The average of length is " + getAverageOfRanking(singer));

	}

}
