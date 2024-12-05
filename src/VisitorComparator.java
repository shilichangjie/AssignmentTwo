package src;

import java.util.Comparator;

class VisitorComparator implements Comparator<Visitor> {

    public VisitorComparator() {
    }

    @Override
    public int compare(Visitor v1, Visitor v2) {
        // 性别 年龄比较
        int result = v1.gender.equals("Male") ? -1 : v1.gender.equals("Female") ? 1 : 0;

        if (result == 0) {
            result = Integer.compare(v1.age, v2.age);
        }

        return result;
    }
}
