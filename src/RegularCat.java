public class RegularCat extends Animal {
    RegularCat(String name, String color, byte age) {
        super(name, color, age);
        if (age > 3 && age < 7) super.setLimits((float)2,300,0);
        else if (age >= 7) super.setLimits((float)1,100,0);
        else super.setLimits((float)3,400,0);
    }
    @Override
    String swim(int distance){
        return (name + " не умеет плавать");
    }
}
