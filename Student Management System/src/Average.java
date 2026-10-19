public class Average {
    public int Avg(int []marks){
        int total = 0;
        for(int mark : marks){
            total +=mark;
        }
        return total/ marks.length;
    }
}
