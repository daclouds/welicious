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

            // Join Fail Response
            return 0;
        } else {
            members.add(m);

            // Join Success Response
            return 1;
        }
    }

    public int exit(Member m) {
        for(int count =0 ; count < members.size(); count++) {
            if(members.get(count).equals(m)) {

                members.remove(m);

                // Exit Success Response
                return 1;
            }
        }

        // Exit Fail Response
        return 0;
    }

    @Override
    public String toString() {
        return "- Group Topic - " + topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
