import java.util.List;

/**
 * Created by 1002461 on 15. 2. 16..
 */
public class Group {
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
