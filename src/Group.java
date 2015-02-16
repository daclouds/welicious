import java.util.ArrayList;


public class Group {

	private String region;
	private String topic;
	private Dining dining;
	private int maxMemberCount;
	private ArrayList<Member> members;

	public Group(String region, String topic, int maxMemberCount) {
		
		this.region = region;
		this.topic = topic;
		this.maxMemberCount = maxMemberCount;
	}
	
	public int addMember(Member m) {
		
		if (members.size() < maxMemberCount) {
			members.add(m);
			// Successfully added
			return 1;
		}
	
		// Group is full
		return -1;
	}
	
	public void removeMemver(Member m) {
		
		for (Member t : members) {
			if (t == m) {
				members.remove(m);
			}
		}
	}
}
