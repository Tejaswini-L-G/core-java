class PlayListRunner{
 public static void main(String[] args){
  PlayList manager=new PlayList();
  manager.addSongnames("Believer");
  manager.addSongnames("Shape of You");
  manager.addSongnames("Blinding Lights");
  manager.addSongnames("Closer");
  manager.addSongnames("Faded");
  manager.addSongnames("Senorita");
  manager.addSongnames("Levitating");
  manager.addSongnames("Perfect");
  manager.addSongnames("Havana");
  manager.addSongnames("Counting Stars");
  manager.addSongnames("Stay");
  manager.addSongnames("Peaches");
  manager.addSongnames("Love Me Like You Do");
  manager.addSongnames("Bad Guy");
  manager.addSongnames("Heat Waves");
  manager.getSongnames();
  
  int index=0;
System.out.println("The song at position "+index+" is "+ playList.getSongNamesByIndex(index));

String name="Believer";
int result = playList.getIndexBySongNames(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}

System.out.println("--------------------------");
boolean isUpdated = playList.updateSongNames("Believer","Believer Remix");
System.out.println("The updation is " + isUpdated);
playList.getSongNames();

System.out.println("--------------------------");
boolean isDeleted = playList.deleteSongNames("Believer");
System.out.println("The deletion is " + isDeleted);
playList.getSongNames();
 }
}
