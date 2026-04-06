public class Monkey extends RescueAnimal {
	
	private String tailLength; // Saves monkey's tail length
	private String height; // Saves monkey's height
	private String bodyLength; // Saves monkey's body length
	private String species; // Saves monkey's species
	
	// constructor
	public Monkey(String name, String gender, String age,
		    String weight, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry, String tailLength, String height, String bodyLength, String species) {
		this.tailLength = tailLength;
		this.height = height;
		this.bodyLength = bodyLength;
		this.species = species;
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
		setAnimalType("monkey"); // This line ensures animalType is set.
	}
	
	// Sets tail length
	public void setTailLength (String tailLength) {
		this.tailLength = tailLength;
	}
	
	// Gets tail length
	public String getTailLength () {
		return tailLength;
	}
	
	// Sets height
	public void setHeight (String height) {
		this.height = height;
	}
	
	// Gets height
	public String getHeight () {
		return height;
	}
	
	// Sets body length
	public void setBodyLength (String bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	// Gets body length
	public String getBodyLength () {
		return bodyLength;
	}
	
	// Sets species
	public void setSpecies (String species) {
		this.species = species;
	}
	
	// Gets species
	public String getSpecies () {
		return species;
	}
}
