public class RegularDog extends Animal {
    RegularDog(String name, String color, byte age) {
        super(name, color, age);
        if (age > 2 && age < 5) super.setLimits((float)0.5,500,10);
        else if (age >= 5) super.setLimits((float)0.3,300,5);
        else super.setLimits((float)0.6,700,15);
    }

}

