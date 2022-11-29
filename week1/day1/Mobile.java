package week1.day1;

public class Mobile {

		
				
		public void makeCall()
		{
			
			 String mobileModel="Redmi";
			float mobileWeight=60.3f;
			System.out.println("Mobile model is " +mobileModel);
			System.out.println("Mobile weight is " +mobileWeight);
		
		}
		
		public void sendMsg()
		
		{
			
			boolean isFullCharged=true;
			int mobileCost=20585;
			System.out.println("Mobile is fully charged " +isFullCharged);
			System.out.println("Mobile cost is " +mobileCost);
		
		}
		
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		
			Mobile objMobile=new Mobile();
		objMobile.makeCall();
		objMobile.sendMsg();
		System.out.println("This is my mobile");
	

}

		
		
	}


