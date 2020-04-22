package roaches;

public class RoachSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
RoachPopulation RoachPop = new RoachPopulation(10);
		
		System.out.println("The Initial Roach population "
				+ "is " + RoachPop.getRoaches());
		
		RoachPop.breed();
		
		System.out.println("The Roach population after cycle 1 "
				+ "breeding is " + RoachPop.getRoaches());
		
		RoachPop.spray(50);
		
		System.out.println("The Roach population "
				+ "after cycle 1 50 percent spraying is: " + RoachPop.getRoaches());
		
		RoachPop.breed();
		
		System.out.println("The Roach population after "
				+ "cycle 2 breeding is " + RoachPop.getRoaches());
        
		RoachPop.spray(60);
        
		System.out.println("The Roach population after "
				+ "cycle 2 60% spraying: " + RoachPop.getRoaches());

        RoachPop.breed(); 
        
        System.out.println("The Roach population after "
        		+ "cycle 3  breeding: " + RoachPop.getRoaches());
        
        RoachPop.spray(70); 
        
        System.out.println("The Roach population after "
        		+ "cycle 3 70% spraying: " + RoachPop.getRoaches());

        RoachPop.breed();
        
        System.out.println("The Roach population after "
        		+ "cycle 4  breeding: " + RoachPop.getRoaches());
        
        RoachPop.spray(80);
        
        System.out.println("Roach population after "
        		+ "cycle 4 80% spraying: " + RoachPop.getRoaches());

	}

}
