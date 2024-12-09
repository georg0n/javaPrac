package ru.mirea.lab4;

public class Human {
    private String name;
    private int age;

    Human(String name, int age) {
        this.name = name;
        this.age =  age;
        System.out.println("[+] Human object was created");
    }

    void display_info() {
        System.out.println("Human name: " + this.name + ", age: " + this.age);
    }

    // Name getter
    String get_name() {
        return this.name;
    }

    // Name setter
    void set_name(String name) {
        this.name = name;
    }

    // Age getter
    int get_age() {
        return this.age;
    }

    // Age setter
    void set_age(int age) {
        if (0 < age && age < 100) {
            this.age = age;
        }
    }

    public String toString() {
        return this.name;
    }

    class Head {
        private boolean is_sleeping = false;

        // Head think method
        void think() {
            System.out.println(name + " is thinking");
        }

        // Head sleep method
        void sleep(boolean is_sleeping) {
            this.is_sleeping = is_sleeping;
            if (this.is_sleeping) System.out.println(name + " now sleeping");
            else System.out.println(name + " now not sleeping");
        }
    }

    class Leg {

        // Leg moving method
        void move() {
            System.out.println(name + "'s leg is moving");
        }
    }

    class Hand {
        private String item_in_hand;

        // Hand moving method
        void move() {
            System.out.println(name + "'s hand is moving");
        }

        // Hand holding item method
        void hold_item(String item) {
            this.item_in_hand = item;
            System.out.println(name + " holds " + this.item_in_hand);
        }

        // Hand dropping item method
        void drop_item() {
            if (item_in_hand != null) {
                System.out.println(name + " dropped " + this.item_in_hand);
                this.item_in_hand = null;
            }
            else{
                System.out.println(name + " dropped nothing");
            }
        }
    }
}
