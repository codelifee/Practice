package publicpractice.oop;

class Mp3 {
	private static String comp="nothing";
	private static int size=0;
	
	public static String getComp() {
		return comp;
	}
	
	public static int getSize() {
		return size;
	}
	
	public void setComp(String comp) {
		Mp3.comp = comp;
	}
	
	public void setSize(int size) {
		Mp3.size = size;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Mp3 mp3 = new Mp3();
		
		mp3.setComp("myMp3");
		mp3.setSize(5);		
	}
}
