package OOP_Concepts;

import java.text.DecimalFormat;

public class Rectangle implements Shape{
    private float width;
    private float height;

    Rectangle(float w,float h){
        this.width=roundToTwoDecimalPlaces(w);
        this.height=roundToTwoDecimalPlaces(h);
    }
   //Method to round the input to two decimal places
    public float roundToTwoDecimalPlaces(float value){
        //Value should be Multipy by 100 ,then round the result, after that result should be divide by 100. {(Math.round(value} result of this part is double
        return (float) (Math.round(value*100.0f)/100.0f);
    }
    public float calculateArea(){
        return  width*height;
    }

}
