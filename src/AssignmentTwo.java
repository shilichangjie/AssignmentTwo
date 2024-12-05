package src;

public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
        assignment.partSix();
        assignment.partSeven();
    }

    public void partThree() {
        // 1. 创建一个 `Ride` 对象。

        Ride ride = new Ride("roller coaster",new Employee("Ivy Davis", 35, "Male", 2, "Operator"));
        // 2. 至少向队列中添加 5 位游客。

        ride.addVisitorToQueue(new Visitor("Alice Johnson", 30, "Female", "123-456-7890", "Tourist"));
        ride.addVisitorToQueue(new Visitor("Bob Smith", 45, "Male", "234-567-8901", "VIP"));
        ride.addVisitorToQueue(new Visitor("Charlie Brown", 28, "Male", "345-678-9012", "Regular"));
        ride.addVisitorToQueue(new Visitor("David Williams", 35, "Male", "456-789-0123", "Tourist"));
        ride.addVisitorToQueue(new Visitor("Eva Clark", 22, "Female", "567-890-1234", "VIP"));
        // 3. 移除队列中的 1 位游客。

        ride.removeVisitorFromQueue("Eva Clark");
        // 4. 打印队列中所有游客。

        ride.printQueue();
    }

    public void partFourA() {

        Ride ride = new Ride("roller coaster",new Employee("Ivy Davis", 35, "Male", 2, "Operator"));
        // 1. 至少向历史记录中添加 5 位游客。

        ride.addVisitorToHistory(new Visitor("Alice Johnson", 30, "Female", "123-456-7890", "Tourist"));
        ride.addVisitorToHistory(new Visitor("Bob Smith", 45, "Male", "234-567-8901", "VIP"));
        ride.addVisitorToHistory(new Visitor("Charlie Brown", 28, "Male", "345-678-9012", "Regular"));
        ride.addVisitorToHistory(new Visitor("David Williams", 35, "Male", "456-789-0123", "Tourist"));
        ride.addVisitorToHistory(new Visitor("Eva Clark", 22, "Female", "567-890-1234", "VIP"));
        // 2. 检查一位游客是否在历史记录中。

        ride.checkVisitorFromHistory("Bob Smith");
        // 3. 打印历史记录中的游客数量。

        System.out.println("numberOfVisitors:" + ride.numberOfVisitors());
        // 4. 打印历史记录中所有游客信息。

        ride.printRideHistory();
    }

    public void partFourB() {
        // 1. 创建一个 `Ride` 对象。

        Ride ride = new Ride("roller coaster",new Employee("Ivy Davis", 35, "Male", 2, "Operator"));
        // 2. 添加至少 5 位游客到历史记录。

        ride.addVisitorToHistory(new Visitor("Alice Johnson", 30, "Female", "123-456-7890", "Tourist"));
        ride.addVisitorToHistory(new Visitor("Bob Smith", 45, "Male", "234-567-8901", "VIP"));
        ride.addVisitorToHistory(new Visitor("Charlie Brown", 28, "Male", "345-678-9012", "Regular"));
        ride.addVisitorToHistory(new Visitor("David Williams", 35, "Male", "456-789-0123", "Tourist"));
        ride.addVisitorToHistory(new Visitor("Eva Clark", 22, "Female", "567-890-1234", "VIP"));
        // 3. 打印未排序的历史记录。

        ride.printRideHistory();

        // 4. 排序并打印排序后的历史记录。
        ride.sortRideHisotry();;
        ride.printRideHistory();
    }

    public void partFive() {
       
    }

    public void partSix() {

       
    }

    public void partSeven() {
        
    }
}
