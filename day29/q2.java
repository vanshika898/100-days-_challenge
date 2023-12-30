abstract class animal {
    public int getAge() {
        return 10;
    }
}

class donkey extends animal {
    public int getAge() {
        return 20;
    }
}

class monkey extends animal {
    public int getage() {
        return 100;
    }
}

class aaa {
    public int getAge() {
        return 75;
    }
}

class lion {
    public void eat(animal aa) {
        int x = aa.getAge();
        System.out.println(x);
    }
}

class zoo {
    public static lion sherkhan = new lion();
}

class q2 {
    public static void main(String[] args) {
        donkey d = new donkey();
        monkey m = new monkey();
        aaa a = new aaa();
        zoo.sherkhan.eat(d);
        zoo.sherkhan.eat(m);
    }
}
