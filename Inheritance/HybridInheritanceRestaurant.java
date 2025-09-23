/**
 * HybridInheritanceRestaurant.java
 * Demonstrates hybrid inheritance using interfaces with Person superclass,
 * Worker interface, and Chef and Waiter subclasses implementing Worker.
 */

interface Worker {
    void performDuties();
}

class PersonWorker {
    protected String name;
    protected int id;

    public PersonWorker(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends PersonWorker implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking meals.");
    }
}

class Waiter extends PersonWorker implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}

public class HybridInheritanceRestaurant {
    public static void main(String[] args) {
        Worker chef = new Chef("Gordon", 1);
        Worker waiter = new Waiter("Alice", 2);

        chef.performDuties();
        waiter.performDuties();
    }
}
