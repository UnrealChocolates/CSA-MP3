public class Scoreboard {

  private String team1;
  private String team2;
   private int team1Score;
   private int team2Score;
  private boolean activeTeamisTeam1;
 public Scoreboard (String t1, String t2){
   team1 = t1;
   team2 = t2;
   team1Score = 0;
   team2Score = 0;
   activeTeamisTeam1 = true;
 }
  public void recordPlay(int sum){
    if (sum == 0){
      activeTeamisTeam1 = false;
    } else {
      if (activeTeamisTeam1){
          team1Score += sum;
      } else {
          team2Score += sum;
      }
    }
  }
  public String getScore(){
    String teamName = "";
    if (activeTeamisTeam1){
      teamName = team1;
    } else {
      teamName = team2;
    }
    return team1Score +'-'+team2Score+teamName;
  }
}
