class Degree {
    public void getDegree() {
        System.out.println("I got a degree.");
    }
}

class Undergraduate extends Degree {
    public void getDegree() {
        System.out.println("I am an Undergraduate.");
    }
}

class Postgraduate extends Degree {
    public void getDegree() {
        System.out.println("I am a Postgraduate.");
    }
}

public class p21 {
    public static void main(String[] args) {
        Degree degree = new Degree();
        Undergraduate undergrad = new Undergraduate();
        Postgraduate postgrad = new Postgraduate();

        degree.getDegree();
        undergrad.getDegree();
        postgrad.getDegree();
    }
}
