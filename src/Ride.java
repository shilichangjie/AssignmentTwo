package src;


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

    // 添加游客记录
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        history.add(visitor);
    }

    // 历史记录检查
    @Override
    public void checkVisitorFromHistory(String visitorName) {
        for (Visitor visitor : history) {
            if (visitor.getName().equals(visitorName)) {
                System.out.println("checked");
            }
        }
        System.out.println("not checked");
    }
    // 排序
    public void sortRideHisotry() {
        Collections.sort(history, new VisitorComparator());
    }

    // 历史游客数量
    @Override
    public int numberOfVisitors() {
        return history.size();
    }

    // 打印历史记录
    @Override
    public void printRideHistory() {
        Iterator<Visitor> iterator = history.iterator();
        if (history.size() == 0) {
            System.out.println("empty");
            return;
        }
        while (iterator.hasNext()) {
            Visitor visitor = iterator.next();
            System.out.println(visitor.toString());
        }
    }

    @Override
    public void runOneCycle() {

        
    }

    @Override
    public void exportRideHistory(String filename) {
        
    }

    @Override
    public void importRideHistory(String filename) {
        
    }

}
