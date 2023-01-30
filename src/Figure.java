public class Figure {
    float a;

    void setA(float a){ //сеттер
        if(a <= 0 && a >1000f){
            System.out.println("длина должна быть в диапазоне от 0,1 до 1000");
        }
        this.a = a;
    }
    float getA() {return this.a;} //геттер

    Figure(float a){ //конструктор параметром
        this.a = a;
    }
    Figure() {      //явное использование конструктора по умолчанию
        a = 1;
    }
    //метод для получения площади (без реализации)
    double getArea(){
        return a;
    };
    //метод для получения периметра (без реализации)
    float getPerimetr(){
        return a;
    }
}
