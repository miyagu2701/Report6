public class Jadge{
    private int sumNum;
    public void jadge(int sumNum){
        this.sumNum = sumNum;
    }
    public void setJadge(int sumNum){
        this.sumNum = sumNum;
    }
    public void getjadge(){
        if(sumNum>21){
            System.out.println("バーストしました");
        }
    }
}