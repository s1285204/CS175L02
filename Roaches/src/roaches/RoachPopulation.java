package roaches;

public class RoachPopulation {
	
	private int pop;

    public RoachPopulation(int pop) {
        this.pop = pop;
    }

    public void breed() {
        pop *=2 ;
    }

    public void spray(double percent) { 
        double temp =  pop -(pop* (percent/100));
        pop =   (int) Math.round(temp);

    }

    public int getRoaches() {
        return pop;

}
}
