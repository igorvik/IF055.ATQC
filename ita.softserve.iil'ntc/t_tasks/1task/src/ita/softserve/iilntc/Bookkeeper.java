package ita.softserve.iilntc;

public class Bookkeeper {
    public static void main (String [] args) {
        
        //TODO what's z? - FIXED
        int keyForIdGenerator = 1;
        Worker coworker[] = new Worker[6];

        coworker[0] = new HourSalaryWorker(100000+100*(keyForIdGenerator++), "John", "Thompson", 50.00);
        coworker[1] = new HourSalaryWorker(100000+100*(keyForIdGenerator++), "Sarah", "Loich", 60.00);
        coworker[2] = new HourSalaryWorker(100000+100*(keyForIdGenerator++), "Tomas", "Gordon", 61.00);

        coworker[3] = new FixedSalaryWorker(100000+100*(keyForIdGenerator++), "Garry", "Writer", 3900.00);
        coworker[4] = new FixedSalaryWorker(100000+100*(keyForIdGenerator++), "Mimi", "Lo", 5000.00);
        coworker[5] = new FixedSalaryWorker(100000+100*(keyForIdGenerator++), "Moro", "Moon", 9000.00);

        for(int i = 0; i < coworker.length; ++i){
            System.out.println(coworker[i]);
        }
        
    }
}
