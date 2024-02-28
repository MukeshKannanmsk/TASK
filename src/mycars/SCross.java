package mycars;
public class SCross extends Car {
    public SCross() {
	}

	private int seats;
    private int airbags;
    private String model;
    private String color;


    public int getSeats() {
        return seats;
    }

    public int getAirbags() {
        return airbags;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void maintenance() {
	    System.out.println("Maruthi SCross is under maintenance");
    }
    
    
}