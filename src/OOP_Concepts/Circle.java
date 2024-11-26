package OOP_Concepts;

public class Circle implements Shape {
    private float radius;

    Circle(float r){
        this.radius=roundToTwoDecimals(r);
    }

    public float roundToTwoDecimals(float value){
        return (float) (Math.round(value*100.0f)/100.0f);
    }
    public float calculateArea(){
        //The overall result of Math.PI * Math.pow(radius, 2) is a double. therefore we should cast it.
         float areaBeforeRound=(float)(Math.PI*Math.pow(radius,2));
         return roundToTwoDecimals(areaBeforeRound);
    }

}
