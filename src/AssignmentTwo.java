package src;

public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        System.out.println("partThree==================================");
        assignment.partThree();
        System.out.println("partFourA==================================");
        assignment.partFourA();
        System.out.println("partFourB==================================");
        assignment.partFourB();
        System.out.println("partFive===================================");
        assignment.partFive();
        System.out.println("partSix====================================");
        assignment.partSix();
        System.out.println("partSeven==================================");
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

        // 创建一个新的 `Ride` 对象。
        Ride ride = new Ride("roller coaster",new Employee("Ivy Davis", 35, "Male", 2, "Operator"));

        // 向队列中添加至少10位游客。
        ride.addVisitorToQueue(new Visitor("Alice Johnson", 30, "Female", "123-456-7890", "Tourist"));
        ride.addVisitorToQueue(new Visitor("Bob Smith", 45, "Male", "234-567-8901", "VIP"));
        ride.addVisitorToQueue(new Visitor("Charlie Brown", 28, "Male", "345-678-9012", "Regular"));
        ride.addVisitorToQueue(new Visitor("David Williams", 35, "Male", "456-789-0123", "Tourist"));
        ride.addVisitorToQueue(new Visitor("Eva Clark", 22, "Female", "567-890-1234", "VIP"));
        ride.addVisitorToQueue(new Visitor("Frank White", 50, "Male", "678-901-2345", "Regular"));
        ride.addVisitorToQueue(new Visitor("Grace Lee", 60, "Female", "789-012-3456", "Tourist"));
        ride.addVisitorToQueue(new Visitor("Henry Martin", 40, "Male", "890-123-4567", "VIP"));
        ride.addVisitorToQueue(new Visitor("Ivy Davis", 33, "Female", "901-234-5678", "Regular"));
        ride.addVisitorToQueue(new Visitor("Jack Miller", 25, "Male", "012-345-6789", "Tourist"));
        // 3. 打印所有队列中的游客信息。
        ride.printQueue();
        // 4. 运行一次周期。
        ride.runOneCycle();
        // 5. 打印周期运行后队列中的游客信息。
        System.out.println("printQueue---------------------");
        ride.printQueue();
        // 6. 打印历史记录中所有游客的信息。
        System.out.println("printRideHistory-------------------");
        ride.printRideHistory();
    }

    public void partSix() {
        
    }

    public void partSeven() {
        
    }
}
