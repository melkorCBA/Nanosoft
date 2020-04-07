public class LargeProject extends  Project {
    private int time;
    private int leader_largeId;

    public LargeProject() {
        super();
    }

    public LargeProject(int p_id,int time, int leader_largeId) {
        super(p_id);
        this.time = time;
        this.leader_largeId = leader_largeId;
    }

    public int getTime() {
        return time;
    }

    public int getLeader_large() {
        return leader_largeId;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setLeader_large(int leader_largeId) {
        this.leader_largeId = leader_largeId;
    }

    public String addProject(){
        return "INSERT INTO P_Large(P_Id,P_L_LeadrID,P_L_Time) VALUES("+p_id+","+leader_largeId+","+time+");";


    }
}
