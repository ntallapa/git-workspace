/**
 * 
 */
package com.projects.wiki.bwiki.db;

/**
 * @author ntallapa
 *
 */
public class Place {
	
	private int no;
	private String place;
	private String rating;
	private String type;
	private int dist; 
	private String direction; 
	private String road; 
	private String food; 
	private String lodge; 
	private String food_lodge; 
	private String petrol; 
	private String remarks; 
	private int days_reqd; 
	private String from_period; 
	private String to_period; 
	
	public Place() {
		// TODO Auto-generated constructor stub
	}
	
	public Place(String place, String rating, String type) {
		super();
		
		this.place = place;
		this.rating = rating;
		this.type = type;
	}
	
	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}
	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}
	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}

	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}

	/**
	 * @return the dist
	 */
	public int getDist() {
		return dist;
	}

	/**
	 * @param dist the dist to set
	 */
	public void setDist(int dist) {
		this.dist = dist;
	}

	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * @return the road
	 */
	public String getRoad() {
		return road;
	}

	/**
	 * @param road the road to set
	 */
	public void setRoad(String road) {
		this.road = road;
	}

	/**
	 * @return the food
	 */
	public String getFood() {
		return food;
	}

	/**
	 * @param food the food to set
	 */
	public void setFood(String food) {
		this.food = food;
	}

	/**
	 * @return the lodge
	 */
	public String getLodge() {
		return lodge;
	}

	/**
	 * @param lodge the lodge to set
	 */
	public void setLodge(String lodge) {
		this.lodge = lodge;
	}

	/**
	 * @return the food_lodge
	 */
	public String getFood_lodge() {
		return food_lodge;
	}

	/**
	 * @param food_lodge the food_lodge to set
	 */
	public void setFood_lodge(String food_lodge) {
		this.food_lodge = food_lodge;
	}

	/**
	 * @return the petrol
	 */
	public String getPetrol() {
		return petrol;
	}

	/**
	 * @param petrol the petrol to set
	 */
	public void setPetrol(String petrol) {
		this.petrol = petrol;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the days_reqd
	 */
	public int getDays_reqd() {
		return days_reqd;
	}

	/**
	 * @param days_reqd the days_reqd to set
	 */
	public void setDays_reqd(int days_reqd) {
		this.days_reqd = days_reqd;
	}

	/**
	 * @return the from_period
	 */
	public String getFrom_period() {
		return from_period;
	}

	/**
	 * @param from_period the from_period to set
	 */
	public void setFrom_period(String from_period) {
		this.from_period = from_period;
	}

	/**
	 * @return the to_period
	 */
	public String getTo_period() {
		return to_period;
	}

	/**
	 * @param to_period the to_period to set
	 */
	public void setTo_period(String to_period) {
		this.to_period = to_period;
	}
	
	

}
