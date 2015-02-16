import java.util.List;

/**
 * Created by 1002461 on 15. 2. 16..
 */
public class Group {
    private Dinning plan;
    private String region;
    private String topic;
    private int maxMemberCount;
    private List<Member> members;

    public int join(Member m) {
        if (maxMemberCount <= members.size()) {
            return joinFailStatus;
        } else {
            members.add(m);
            return joinSuccess;
        }
    }

    public int exit(Member m) {
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

    public Dinning getPlan() {
        return plan;
    }

    public void setPlan(Dinning plan) {
        this.plan = plan;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getMaxMemberCount() {
        return maxMemberCount;
    }

    public void setMaxMemberCount(int maxMemberCount) {
        this.maxMemberCount = maxMemberCount;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
