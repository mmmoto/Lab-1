public class HeightAndWeight {
  private int height;  // ins.
  private int weight;  // lbs.

  // Constructor
  public HeightAndWeight(int h, int w){
      height = h;
      weight = w;
  }

  // toString method
  public String toString() {
    return "Height: " + height + " in. " + "Weight: " + weight + " lbs";
  }

  // Getter Methods
  public int getHeight(){
    return height;
  }

  public int getWeight(){
    return weight;
  }

  // HeightAndWeight Operators
  public double getBMI(){
    return convertPoundsToKgs(weight) /  Math.pow(convertFeetToMeters(height), 2);
  }

  public boolean healthyBMI(){
    if (BMI >= 18.5 && BMI <= 24.9){
        return true;
    } else {
        return false;
    }

  }

  public String getDescript(){
    if(healthyBMI.equals(true)){
      return "normal"
    } else{
       if (BMI <= 18.5){
        return "underweight";
       } else if (BMI >= 25.0 && BMI <= 29.9){
        return "overweight";
       } else if(BMI <= 30.0 ){
        return "obese";
       }

    }
	
  }

  // Private Methods
  private double convertFeetToMeters(int h){
       return h * 0.0254;
  }

  private double convertPoundsToKgs(int p){
      return p * 0.454;
  }

}