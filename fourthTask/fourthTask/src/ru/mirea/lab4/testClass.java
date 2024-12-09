package ru.mirea.lab4;

import java.util.Date;

public class testClass {
    public static void main(String[] args) {

        // Circle class test
        Circle circle = new Circle(7.5);
        System.out.println(circle.toString() + ", circle area: " + String.format("%.3f", circle.get_area()));
        circle.set_radius(123);
        System.out.println(circle.toString() + ", circle area: " + String.format("%.3f", circle.get_area()));

        // Human class test
        Human human = new Human("George", 20);
        human.set_age(19);
        human.display_info();

        // Human hand class test
        Human.Hand human_hand = human.new Hand();
        human_hand.move();
        human_hand.drop_item();
        human_hand.hold_item("Телефон");
        human_hand.drop_item();

        // Human leg class test
        Human.Leg human_leg = human.new Leg();
        human_leg.move();

        // Human head class test
        Human.Head human_head = human.new Head();
        human_head.think();
        human_head.sleep(true);
        human_head.sleep(false);

        // Book class test
        Book book = new Book("Prestuplenie i nakazaniye", "Dostoevskiy", new Date());
        System.out.println(book);
        book.set_name("newNameBook");
        book.set_writing_date(new Date());
        System.out.println(book);
    }
}
