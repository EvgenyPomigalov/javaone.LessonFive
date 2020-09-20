public class Animal {
    protected String name;
    protected String color;
    protected byte age;
    private float limitHeigth;
    private int limitRun;
    private int limitSwim;

    public Animal(String name, String color, byte age) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

   String run(int distanceRun) {
        if (distanceRun <= limitRun) return (name + " пробежал " + distanceRun);
        else return (name + " не пробежал " + distanceRun);
    }

    String jump(float heigthJump) {
        if (heigthJump <= limitHeigth) return (name + " перепрыгнул " + heigthJump) ;
        else return (name + " не перепрыгнул " + heigthJump);
    }

   String swim(int distanceSwim) {
       if (distanceSwim <= limitSwim) return (name + " проплыл " + distanceSwim);
       else return (name + " не проплыл " + distanceSwim);
    }

    public void setLimits(float limitHeight, int limitRun, int limitSwim) {
        this.limitHeigth = limitHeight;
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
    }
}


