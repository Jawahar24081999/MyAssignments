package week2.day1;

public class GooglePixel {
	//AM    return    methodname
	public void takeHighQualityPhoto() {
		// TODO Auto-generated method stub
		System.out.println("Photo");
		

	}
	public int makeCall() {
		
		
        return 5;
	}
	public static void main(String[] args) {
		GooglePixel pixelOptions=new GooglePixel();
		pixelOptions.takeHighQualityPhoto();
		int number = pixelOptions.makeCall();
		System.out.println(number);
		
	}
	

}
