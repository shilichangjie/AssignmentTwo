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
    int maxRider = 2;
    Employee operator;
    ArrayList<Visitor> queue = new ArrayList<>();
    LinkedList<Visitor> history = new LinkedList<>();
    int numOfCycles = 0;

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

    // 运行一次
    @Override
    public void runOneCycle() {

        if (queue.isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        if (operator == null) {
            System.out.println("operator is empty");
            return;
        }

        for (int i = 0; i < maxRider; i++) {
            if (queue.isEmpty()) {
                break;
            }
            addVisitorToHistory(queue.get(0));
            queue.remove(0);
        }

        numOfCycles++;
        System.err.println("numOfCycles:" + numOfCycles);
    }

    // 导出到文件
    @Override
    public void exportRideHistory(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Visitor visitor : history) {
                writer.write(visitor.getName() + "," + visitor.getAge() + "," + visitor.getGender() + "," +
                        visitor.getPhone() + "," + visitor.getVisitorType());
                writer.newLine();
            }
            System.out.println("export success " + filename);
        } catch (IOException e) {
            System.out.println("export error!");
        }
    }

    // 导入历史记录
    @Override
    public void importRideHistory(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] v = line.split(",");
                Visitor visitor = new Visitor(v[0], Integer.parseInt(v[1]), v[2], v[3], v[4]);
                history.add(visitor);
            }
            System.out.println("import success");
        } catch (IOException e) {
            System.out.println("import error");
        }
    }

}
