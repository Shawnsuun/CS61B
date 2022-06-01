public class Dog {
    public int weightInPounds;

    public Dog(int w) {
    weightInPounds = w;    
    }

    public Dog maxDog(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) {
        return this;
        }
        return d2;
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark. bark.");
        } else {
            System.out.println("woof!");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog(20);
        Dog d2 = new Dog(120);
        d.maxDog(d2).makeNoise();
    }

}