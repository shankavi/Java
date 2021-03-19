package learn.java;



public class CollectAmount {
	
	public Integer collectionAmount = 2500;
	
	public Integer collectionAmountGiveItToMe() {
		System.out.println("Collected Amount is :" + collectionAmount);
		return collectionAmount;
		// return type based on choosing data type
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
 		// ClassName objName = new ClassName();
		CollectAmount collection = new CollectAmount();
		//collection.collectionAmountGiveItToMe();
		
		// if i want to store the value in integer then ..
		Integer amount = collection.collectionAmountGiveItToMe();
		System.out.print("Got the Amount was " + amount);
		
	}

}
