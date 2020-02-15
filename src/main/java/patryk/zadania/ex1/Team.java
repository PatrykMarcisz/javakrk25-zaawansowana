package patryk.zadania.ex1;

public class Team {

    private String name;
    private Member[] members; //int[]

    //new Team("name");
    //new Team("name", new Member(), new Member(), new Member())

    public Team(String name, Member ... members){
        this.name = name;
        //this.members = members;
        this.members = new Member[members.length];
        for(int i=0; i< members.length; i++){
            this.members[i] = members[i];
        }

    }

    public int getCount(){
        return members.length;
    }

    public Member[] getMembers(){
        return this.members;
    }

    public Member[] getMembers(int ... ids){
        Member[] toReturn = new Member[ids.length];
        for(int i=0; i<ids.length; i++) {
            int currentId = ids[i];
            for (Member member : members) {
                if (member.getId() == currentId){
                    toReturn[i] = member;
                }
            }
        }
        return toReturn;
    }

}
