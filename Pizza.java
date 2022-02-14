import java.io.Serializable;


public class Pizza implements Comparable<Pizza>, Serializable{
	
	public static final long serialVersionUID = 13L;

	
	private String size;
	public String cheese;
	public String pineapple;
	public String greenPepper;
	public String ham;
	public static double cost;
	
	/**Full parameter constructor.
	 * 
	 * @param size: Size of pizza.
	 * @param cheese: Amount of cheese on pizza.
	 * @param pineapple: Amount of pineapple on pizza.
	 * @param greenPepper: Amount of green pepper on pizza.
	 * @param ham: Amount of ham on pizza.
	 * @param cost: Cost of pizza
	 * @throws IllegalPracticeException: If arguments are not legal.
	 */	
	public Pizza(String siz, String chees, String pineappl, String greenPeppe, String ha) throws IllegalPizza {
		super();
		
			this.size = size;
			this.cheese = cheese;
			this.pineapple = pineapple;
			this.greenPepper = greenPepper;
			this.ham = ham;
		
		
	}

	///////////////////////////////////

	/**
	 * Sets size of pizza
	 * @param size: Size of pizza
     * @throws IllegalPizza: If size isn't small,medium,or large.
	 */
	public void setSize(String siz) throws IllegalPizza {
		if (size !="small"||size !="medium"||size !="large")
			throw new IllegalPizza("Illegal size: " + size);
		this.size = siz;
		
	}
	
    /**
     * Sets amount of cheese.
     * @param cheese: Amount of cheese.
     * @throws IllegalPizza: If cheese isn't single, double, or triple.
     */	
	public void setCheese(String chees) throws IllegalPizza {
		if (cheese !="single"||cheese != "double" ||cheese != "triple")
			throw new IllegalPizza("Illegal cheese: " + cheese);
		this.cheese = chees;
	}
    
	/**
     * Sets amount of pineapple.
     * @param pineapple: Amount of pineapple.
     * @throws IllegalPizza if pineapple isn't single or none.
     */
	public void setPineapple(String pineappl) throws IllegalPizza {
		  if (pineapple !="single"||pineapple != "none")
			  throw new IllegalPizza("Illegal pineapple: " + pineapple);
	      else if (ham=="none") {
	    	  throw new IllegalPizza("Illegal pizza combination: Pizza cannot "
	            						+ "have pineapple unless it has ham" );}
		this.pineapple = pineappl;
	}
	
	/**
	 *Sets amount of green pepper.
	 * @param greenPepper: Amount of green pepper.
	 * @throws IllegalPizza: If green pepper isn't single or none.
	 */
	public void setGreenPepper(String greenPeppe) throws IllegalPizza {
        if (greenPepper !="single"||greenPepper != "none")
            throw new IllegalPizza("Illegal greenPepper: " + greenPepper);
        else if (ham=="none") {
            throw new IllegalPizza("Illegal pizza combination: Pizza cannot "
            							+ "green pepper unless it has ham" );}
		this.greenPepper = greenPeppe;
	}
   
	/**
     *Sets amount of ham.
     * @param ham: Amount of ham.
     * @throws IllegalPizza: If ham isn't single or none.
     */
	public void setHam(String ha) throws IllegalPizza {
        if (ham !="single"||ham != "none")
            throw new IllegalPizza("Illegal ham: " + ham);		
		this.ham = ha;
	}

	///////////////////////////////////
	
	public String getSize() {
		return size;
	}

	public String getCheese() {
		return cheese;
	}
	
	public String getPineapple() {
		return pineapple;
	}
	
	public String getGreenPepper() {
		return greenPepper;
	}
	
	public String getHam() {
		return ham;
	}
	
	
	/**
	 * Calculates cost of pizza
	 * @param cost: Cost of pizza.
	 */
	public double getCostSize() {

	     	if(size.equals("small")){
	     		cost=7;}
	     	if(size.equals("medium")){
	     		cost=9;}
	     	if(size.equals("large")){
	     		cost=11;}
	     	
			return cost;
	}

	public double getCostToppings() {
		if (cheese.equals("single")){
			cost+=1.5;}
		if (cheese.equals("double")){
			cost+=3;}
		if (cheese.equals("triple")){
			cost+=4.5;}
		
		if (pineapple.equals("single")){
			cost+=1.5;}
		if (pineapple.equals("none")){
			cost+=1.5;}
		
		if (greenPepper.equals("single")){
			cost+=1.5;}
		if (greenPepper.equals("none")){
			cost+=1.5;}
		
		if (ham.equals("single")){
			cost+=1.5;}
		if (ham.equals("none")){
			cost+=1.5;}
		
		return cost;
	}

	public double getCost() {
		final double cost=getCostSize()+getCostToppings();
		return  cost;}
	
	
	
	@Override
	public String toString() {
		String s= size+" pizza, "+cheese+ " cheese";
		
		if (pineapple=="single") {
			s+=", "+pineapple+" pineapple";}
		if (greenPepper=="single") {
			s+=", "+greenPepper+" green pepper";}	
		if (ham=="single") {
			s+=", "+ham+" ham";}
		
		s+=". Cost: $"+cost+" each.";
		return s;
		}
    
	@Override
	public int compareTo(Pizza e ){
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Pizza clone() {
    	Pizza pizzaCopy = null;
        try{
        	pizzaCopy = new Pizza(size, cheese, pineapple, greenPepper,ham);
        }catch (IllegalPizza e) {
            // Should never get here!
            return null;
        } // end try/catch
        return pizzaCopy;
    } // end clone
}
