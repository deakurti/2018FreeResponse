public class CodeWorkChecker implements StringChecker{
    private int max;
    private int min;
    private String no;

public CodeWorkChecker (int max, int min, String no) {
    this.max = max;
    this.min = min;
    this.String = no;
}
public CodeWorker (String str) {
    this.max = 20;
    this.min = 6;
    this.no = no;
}
public boolean isValid (String str) {
    if (str.length() < this.max || str.length() > this.min || str.indexOf(this.no) != -1) {
        return true;
    } else return false;
}
}
