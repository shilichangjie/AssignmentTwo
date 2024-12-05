package src;
// part2
interface RideInterface {
    void addVisitorToQueue(Visitor visitor);

    void removeVisitorFromQueue(String visitorName);

    void printQueue();

    void addVisitorToHistory(Visitor visitor);

    void checkVisitorFromHistory(String visitorName);

    int numberOfVisitors();

    void printRideHistory();

    void runOneCycle();

    void exportRideHistory(String fileName);

    void importRideHistory(String fileName);
}
