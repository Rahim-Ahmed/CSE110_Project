package projectWork;

public class tri2 extends tri1{

    float h ;
    float b ;
    tri2(float h,float b){
        this.h=h;
        this.b=b;
    }

    @Override
    float area() {
        return (h*b)/2;
    }
}
