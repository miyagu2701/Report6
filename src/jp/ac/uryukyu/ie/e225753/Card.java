public class Card {
    private int num;
    private String mark;
    public Card(int num, String mark){
        this.num = num;
        this.mark = mark;
    }
    public int getNum(){
        return this.num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public String getMark(){
        return this.mark;
    }
    public void setMark(String mark){
        this.mark = mark;
    }
}
