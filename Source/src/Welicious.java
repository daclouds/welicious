import java.util.List;

public class Welicious {
    public static void main(String[] args) {
        Member member;
        Group group;
    }
}

class Member {
    int age;
    String id;
    String name;
    List<String> interestList;
    List<Group> groupList;

    List<Group> getJoinedGroup() {
        return groupList;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Group Topic 1 : " + groupList.get(0).topic);

        for (int count = 1; count < groupList.size(); count++) {
            builder.append(", Group Topic 2 : " + groupList.get(count).topic);
        }

        return "Name : " + name + ", age : " + age + ", Group List : " + builder.toString();
    }
}

class Group {
    Dinning plan;
    String region;
    String topic;
    int maxMemberCount;
    List<Member> members;

    int join(Member m) {
        if (maxMemberCount <= members.size()) {
            return joinFailStatus;
        } else {
            members.add(m);
            return joinSuccess;
        }
    }

    int exit(Member m) {
        if (members.isExist(m)) {
            members.remove(m);
            return exitSuccessStatus;
        } else {
            return exitFailStatus;
        }
    }

    @Override
    public String toString() {
        return "- Group Topic - " + topic;
    }
}

class Dinning {
    String meetingTime;
    String place;
    String[] menu;
}
