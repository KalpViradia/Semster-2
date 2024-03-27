interface Transport {
    void deliver();
}

abstract class Animal {
    abstract void eat();
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger is eating.");
    }
}

class Camel extends Animal implements Transport {
    @Override
    void eat() {
        System.out.println("Camel is eating.");
    }

    @Override
    public void deliver() {
        System.out.println("Camel is delivering.");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer is eating.");
    }
}

class Donkey extends Animal implements Transport {
    @Override
    void eat() {
        System.out.println("Donkey is eating.");
    }

    @Override
    public void deliver() {
        System.out.println("Donkey is delivering.");
    }
}

public class Lab73 {
    public static void main(String[] args) {
        Animal[] animals = {new Tiger(), new Camel(), new Deer(), new Donkey()};

        for (Animal animal : animals) {
            if (animal instanceof Transport) {
                ((Transport) animal).deliver();
            }
        }
    }
}