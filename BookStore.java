
public class BookStore {

	// science [10p], "history[15p]", "drama[5p]", "romance[7p]", "action[5p]

	// I will count when they add new book
	// making static because i don't want to lose
	private static double scienceBookPrice, historyBookPrice, dramaBookPrice, romanceBookPrice, actionBookPrice = 0;
	private static int scienceBookCount, historyBookCount, dramaBookCount, romanceBookCount, actionBookCount = 0;

	// I created getters and setters
	// Right Click > Source > Generate Getters and Setter
	// I ticked all the getters and setters

	// Getter and setter for Science Book Price

	public double getScienceBookPrice() {
		return this.scienceBookPrice;
	}

	public void setScienceBookPrice(double scienceBookPrice) {
		this.scienceBookPrice += scienceBookPrice;
	}

	// Getter and setter for History Book Price

	public double getHistoryBookPrice() {
		return this.historyBookPrice;
	}

	public void setHistoryBookPrice(double historyBookPrice) {
		this.historyBookPrice += historyBookPrice;
	}

	// Getter and setter for Drama Book Price

	public double getDramaBookPrice() {
		return this.dramaBookPrice;
	}

	public void setDramaBookPrice(double dramaBookPrice) {
		this.dramaBookPrice += dramaBookPrice;
	}

	// Getter and setter for Romance Book Price

	public double getRomanceBookPrice() {
		return this.romanceBookPrice;
	}

	public void setRomanceBookPrice(double romanceBookPrice) {
		this.romanceBookPrice += romanceBookPrice;
	}

	// Getter and setter for Action Book Price

	public double getActionBookPrice() {
		return this.actionBookPrice;
	}

	public void setActionBookPrice(double actionBookPrice) {
		this.actionBookPrice += actionBookPrice;
	}

	// Getter and setter for Science Book Count

	public int getScienceBookCount() {
		return this.scienceBookCount;
	}

	public void setScienceBookCount(int amount) {
		this.scienceBookCount += amount;
	}

	// Getter and setter for History Book Count

	public int getHistoryBookCount() {
		return this.historyBookCount;
	}

	public void setHistoryBookCount(int amount) {
		this.historyBookCount += amount;
	}

	// Getter and setter for Drama Book Count

	public int getDramaBookCount() {
		return this.dramaBookCount;
	}

	public void setDramaBookCount(int amount) {
		this.dramaBookCount += amount;
	}

	// Getter and setter for Romance Book Count

	public int getRomanceBookCount() {
		return this.romanceBookCount;
	}

	public void setRomanceBookCount(int amount) {
		this.romanceBookCount += amount;
	}

	// Getter and setter for Action Book Count

	public int getActionBookCount() {
		return this.actionBookCount;
	}

	public void setActionBookCount(int amount) {
		this.actionBookCount += amount;
	}

}
