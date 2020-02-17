package tEST.one.ds.singlelinkedlist;

public class FriendDemo {

	public static void main(String[] args) {
		Friend friend1 = new Friend("sandhya");
		Friend friend2 = new Friend("ranjitha");
		Friend friend3 = new Friend("abhisek");
		Friend friend4 = new Friend("shweta");
		Friend friend5 = new Friend("naresh");
		
		friend1.link=friend2;
		friend2.link=friend3;
		friend3.link=friend4;
		friend4.link=friend5;
		friend5.link=null;
		
		System.out.println(friend1.link);
		System.out.println(friend2);
		
		FriendList list = new FriendList();
		list.addFriend("abhishek");
		list.addFriend("naresh");
		list.addFriend("ranjitha");
		list.addFriend("sandhya");
		list.addFriend("shweta");
		list.displayAllFriends();




		
		

	}

}
