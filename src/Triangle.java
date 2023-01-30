import static java.lang.Math.*;

public class Triangle extends Figure{
    private float b;
    private float c ;

    void setB(float b){ //сеттер
        if(b <= 0 && b >1000f){
            System.out.println("длина должна быть в диапазоне от 0,1 до 1000");
        }
        this.b = b;
    }
    float getB() {return this.b;} //геттер
    void setC(float a){ //сеттер
        if(a <= 0 && a >1000f){
            System.out.println("длина должна быть в диапазоне от 0,1 до 1000");
        }
        this.c = a;
    }
    float getC() {return this.c;} //геттер


    Triangle(float a, float bb, float cc) {super(a);
        b = bb; c = cc;
    }

    @Override
    double getArea() {
        float pp = getPerinetr() / 2.0f;
        return  sqrt(pp*(pp-a)*(pp-b)*(pp-c));
    }

    float getPerinetr(){
        return super.getPerimetr()+b+c;
    }
}
