package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

class Ride implements RideInterface {
    String rideName;
    Employee operator;
    ArrayList<Visitor> queue = new ArrayList<>();
    LinkedList<Visitor> history = new LinkedList<>();

    public Ride() {
    }

    public Ride(String rideName, Employee operator) {
        this.rideName = rideName;
        this.operator = operator;
    }

    // 添加游客
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        queue.add(visitor);
        System.out.println(" addVisitorToQueue success.");
    }

    // 删除游客
    @Override
    public void removeVisitorFromQueue(String visitorName) {
        for (Visitor visitor : queue) {
            if (visitor.getName().equals(visitorName)) {
                queue.remove(visitor);
                System.out.println("removeVisitorFromQueue success");
                return;
            }
        }
        System.out.println("removeVisitorFromQueue error");
    }

    // 打印游客列表
    @Override
    public void printQueue() {
        for (Visitor visitor : queue) {
            System.out.println(visitor.toString());
        }
    }





    

}
