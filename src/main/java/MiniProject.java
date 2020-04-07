public class MiniProject extends Project {
    private int time;
    private int  leader_miniId;

    public MiniProject() {
        super();
    }

    public MiniProject(int p_id,int time, int leader_miniId) {
        super(p_id);
        this.time = time;
        this.leader_miniId = leader_miniId;
    }

    public int getTime() {
        return time;
    }

    public int getLeader() {
        return leader_miniId;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setLeader(int leader) {
        this.leader_miniId = leader_miniId;
    }

    public String addProject(){
        return "INSERT INTO P_Mini(P_Id,P_M_LeaderID,P_M_Time) VALUES("+p_id+","+ leader_miniId+","+time+");";


    }
}
