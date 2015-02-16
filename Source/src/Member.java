import java.util.List;

/**
 * Created by 1002461 on 15. 2. 16..
 */
public class Member {
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
