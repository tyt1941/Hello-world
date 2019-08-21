
public class DataConversion {

	public static void main(String[] args) {
		//System.out.println((3 + 5 + 8)/3.0);
		double volume = 4/3 * Math.PI * 10*10*10;
		double real_volume = 4/3.0 * Math.PI * 10*10*10;
		System.out.println("the volume of a sphere with radius 10 is: " + volume);
		System.out.println("the real volume of a sphere with radius 10 is: " + real_volume);
		double fahrenheit = 666;
		double celsius = (fahrenheit - 32) * (5/9.0);
		System.out.println("the celsius is" + celsius);
	}
	

}
