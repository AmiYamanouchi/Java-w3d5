
public class Record {

	
		//id ---> random number from 100 to 10000
		//recordTitle ---> Null or empty
		//singerName  ---> Null or empty
		//recordLength  ---> more than zero
		//recordRanking ---> more than zero less than 6
		
		
		private int id;
		private String recordTitle;
		private String singerName;
		private double recordLength;
		private int recordRanking;
		
		
				
		//constructor
		public Record(String recordTitle, String singerName, double recordLength, int recordRanking) {
			 setId();
			 setRecordTitle(recordTitle);
			 setSingerName(singerName);
			 setRecordLength(recordLength);
			 setRecordRanking(recordRanking);
			 
		}
				
				
				
		//getter
		public int getId() {
			return id;
		}
		
		public String getRecordTitle() {
			return recordTitle;
		}
		
		public String getSingerName() {
			return singerName;
		}
		
		public double getRecordLength() {
			return recordLength;
		}
		
		public int getRecordRanking() {
			return recordRanking;
		}
				
				
		//setter
		public void setId() {
			this.id = (int)(Math.random() *(10000 - 1000 + 1) + 100); //(Math.random() * (Max-Min+1)) + min
		}
		
		public void setRecordTitle(String recordTitle) {
			if(!recordTitle.isEmpty() || !recordTitle.equalsIgnoreCase(null)) {
				this.recordTitle = recordTitle;
			}
		}
		
		public void setSingerName(String singerName) {
			if(!singerName.isEmpty() || !singerName.equalsIgnoreCase(null)) {
				this.singerName = singerName;
			}
		}
		
		public void setRecordLength(double recordLength) {
			if(recordLength > 0) {
				this.recordLength = recordLength;
			}
		}
		
		public void setRecordRanking(int recordRanking) {
			if(recordRanking > 0 && recordRanking < 6) {
				this.recordRanking = recordRanking;
			}
		}
		
		
		
		
		

	

}
