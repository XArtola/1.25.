/**
 * 
 */

/**
 * @author ik013043z1
 *
 */
public class Player {

	private String name;
	private String shirtNumber;
	private int age;
	private int height;

	public String getName() {
		
		return name;
	
        }

	public void setLocalTeam(String name) {
		
		this.name=name;
		
	}

	public String getShirtNumber() {
		
		return shirtNumber;
	}

	public void setShirtNumber(String shirtNumber) {
		
		this.shirtNumber = shirtNumber;
		
	}

	public int getAge() {
		
		return age;
		
	}

	public void setAge(int age) {
		
		this.age= age;
		
	}

	public int getHeight() {
		
		return height;
		
	}

	public void setHeight(int height) {
		
		this.height=height;
		
	}
}