/* Task 07
Design the Match class such a way so that the following code provides the expected:

Match match1 = new Match("Rangpur Riders - Cumilla Victorians"); 
System.out.println("========================="); 
match1.add_run(4); 
match1.add_run(6); 
match1.add_over(1); 
System.out.println(match1.print_scoreboard()); 
System.out.println("========================="); 
match1.add_over(5); 
System.out.println("========================="); 
match1.add_wicket(1); 
System.out.println(match1.print_scoreboard());

Output:
5..4..3..2..1.. Play !!! 
============================ 
Batting Team: Rangpur Riders 
Bowling Team: Cumilla Victorians 
Total Runs: 10 Wickets: 0 Overs: 1 
============================ 
Warning! Cannot add 5 over/s (5 over match) 
============================ 
Batting Team: Rangpur Riders 
Bowling Team: Cumilla Victorians 
Total Runs: 10 Wickets: 1 Overs: 1 
 */

public class Match {

    String team;
    int totalRuns = 0;
    int totalWickets = 0;
    int totalOvers = 0;
    final int maxOvers = 5;

    public Match(String team) {
        this.team = team;
    }

    public void add_run(int run) {
        this.totalRuns += run;
    }

    public void add_over(int over) {
        if (totalOvers + over > maxOvers) {
            System.out.println("Warning! Cannot add " + over + " over/s (" + maxOvers + " over match)");
        } else {
            this.totalOvers += over;
        }
    }

    public void add_wicket(int wicket) {
        this.totalWickets += wicket;
    }

    public String print_scoreboard() {
        String battingTeam = team.split("-")[0].trim();
        String bowlingTeam = team.split("-")[1].trim();
        return "Batting Team: " + battingTeam + "\n" + "Bowling Team: " + bowlingTeam + "\n"
                + "Total Runs: " + totalRuns + " Wickets: " + totalWickets + " Overs: " + totalOvers;
    }

    public static void main(String[] args) {

        System.out.println("5..4..3..2..1.. Play !!!");

        Match match1 = new Match("Rangpur Riders - Cumilla Victorians");
        System.out.println("=========================");
        match1.add_run(4);
        match1.add_run(6);
        match1.add_over(1);
        System.out.println(match1.print_scoreboard());
        System.out.println("=========================");
        match1.add_over(5);
        System.out.println("=========================");
        match1.add_wicket(1);
        System.out.println(match1.print_scoreboard());
    }
}
