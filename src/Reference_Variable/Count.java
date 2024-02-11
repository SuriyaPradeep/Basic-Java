package Reference_Variable;

public class Count {
    private int count;
    public Count(int num) {
        this.count = num;
    }
    public void increase(){
        this.count++;
    }
    public void decrease(){
        this.count--;
    }
    public String toString(){
        return String.valueOf(this.count);
    }
}
