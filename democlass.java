/**
 * 
 */
package demo.codejava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author neha mishra
 *
 */
public class democlass {
	float r,area,circumference;
	/*void inus() throws IOException
	{
	System.out.println("enter radius of the circle");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	r=Float.parseFloat(br.readLine());
	}
	*/
	void ar()
	{
		System.out.println("Enter radius");
		Scanner sc= new Scanner(System.in); 
		r=sc.nextFloat();
		sc.close();
	area=3.14f*r*r;
	System.out.println("area of the circle is"+area);
	}
	void circum()
	{
	circumference=2*3.14f*r;
	System.out.println("circumference of circle is"+circumference);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			democlass cir=new democlass();
			cir.ar();
			cir.circum();
			}
	}