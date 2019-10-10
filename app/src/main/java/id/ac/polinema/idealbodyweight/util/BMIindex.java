package id.ac.polinema.idealbodyweight.util;

public class BMIindex {
    private  int weight;
    private  int height;
    private float index;

    public BMIindex (int weight, int height){
        this.weight = weight;
        this.height = height;
        this.index = calculate();
    }

    public float getIndex() {
        return index;
    }

    private float calculate(){
        return (float) (weight/Math.pow(height, 2));
    }
}
