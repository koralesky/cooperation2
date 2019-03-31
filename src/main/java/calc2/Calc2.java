package calc2;

public class Calc2 {

    Calc2Service service;

    public Calc2(Calc2Service service){
        this.service = service;
    }

    public double perform_1(double x, double y){
        return service.add(x, y);
    }

    public double perform_2(double x, double y){
        return service.substract(x, y);
    }

    public double perform_3(double x, double y){
        return service.multiply(x, y);
    }

    public double perform_4(double x, double y){
        return service.divide(x,y);
    }


}
