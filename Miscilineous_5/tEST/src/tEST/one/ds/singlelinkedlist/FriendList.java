package tEST.one.ds.singlelinkedlist;

public class FriendList {
	Friend start;

	public FriendList() {
		start = null;
	}
	
	public void addFriend(String name) {
		Friend temp = new Friend(name);
		temp.link = start;
		start=temp;
	}
	public void displayAllFriends() {
		if(start==null) {
			System.out.println("no friends found");
			return;
		}
		while(start!=null) {
			Friend temp = start;
			System.out.println(temp.name);
			start=temp.link;
		}
		
	}
	
	
	
	

}
