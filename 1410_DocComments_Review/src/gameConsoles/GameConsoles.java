package gameConsoles;
/**
 * Represents 
 * @author vicar
 *
 */

public class GameConsoles {

    private String quality;
    private String company;
    private String model;
    private int id;
    private static int count;
    
    public GameConsoles(String quality, String company, String model) {
    	this.quality = quality;
    	this.company = company;
    	this.model = model;
    	this.id = 1234567 + count++;
    }

	/**
	 * @return the quality
	 */
	public String getQuality() {
		return quality;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	@Override
	public String toString() { 
		return company + " " + model + "  (" + quality +")" + id + " ";
	}
    
    






}
