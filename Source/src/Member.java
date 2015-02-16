import java.util.List;

/**
 * Created by 1002461 on 15. 2. 16..
 */
public class Member {
    private int age;
    private String id;
    private String name;
    private List<String> interestList;
    private List<Group> groupList;

    public List<Group> getJoinedGroup() {
        return groupList;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Group Topic 1 : " + groupList.get(0).getTopic());

        for (int count = 1; count < groupList.size(); count++) {
            builder.append(", Group Topic 2 : " + groupList.get(count).getTopic());
        }

        return "Name : " + name + ", age : " + age + ", Group List : " + builder.toString();
    }
}
