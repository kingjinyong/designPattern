package builder.after;

import builder.before.TourPlan;

public class App {
    public static void main(String[] args){
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan1 = director.cancunTrip();
        TourPlan tourPlan2 = director.longBeachTrip();
        System.out.println(tourPlan2);
    }
}
