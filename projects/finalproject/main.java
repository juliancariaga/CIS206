/*
 File: main.java
 Description: Will output a list of mountains and tell you which has the smallest elevation.
 Created: Sun. June 8, 2023, 5:30:14
 Author: Julian Cariaga
 email: julianc3209@student.vvc.edu
*/

import java.util.LinkedList;
import java.util.List;

class Main {

public static Mountdet getMinElevation(List<Mountdet> mountinfo) {
  Mountdet mountain = mountinfo.get(0);
  Mountdet mnt;
  int i;
    for (i = 1; i < mountinfo.size(); i++) {                                 // finds the mountain with the smallest elevation value
      mnt = mountinfo.get(i);                                                // and returns the mountain with the smallest value
        if (mnt.getElevation() < mountain.getElevation()) {
          mountain = mnt;
        }
    }
    return mountain;
  }


// prints all the mountain info 
public static void printMount(List<Mountdet> mountinfo) {
  System.out.printf("List of various mountains\n\n");  
  System.out.printf("------------------------------------------------------------------------------\n");
  System.out.printf("%-18s | %-18s | %-20s | %-20s\n", "Mountain", "Country", "Elevation (ft)", "Elevation (m)");
  System.out.printf("------------------------------------------------------------------------------\n");

  for (Mountdet mountain : mountinfo) {
    System.out.printf("%-18s | %-18s | %-20f | %-20f\n", mountain.getName(), mountain.getCountry(), mountain.getElevation(), mountain.toMeters());
  }

  System.out.printf("------------------------------------------------------------------------------\n");

} 

    public static void main(String[] args) {
      List<Mountdet> mountinfo = new LinkedList<>();                             // list to store mountain info

      mountinfo.add(new Mountdet("Chimborazo", "Ecuador", 20549));
      mountinfo.add(new Mountdet("Matterhorn", "Switzerland", 14692));
      mountinfo.add(new Mountdet("Olympus", "Greece (Macedonia)", 9573));        // mountain info
      mountinfo.add(new Mountdet("Everest", "Nepal", 29029));
      mountinfo.add(new Mountdet("Mount Marcy", "United States", 5344));
      mountinfo.add(new Mountdet("Mount Mitchell", "United States", 6684));
      mountinfo.add(new Mountdet("Zugspitze", "Switzerland", 9719));

      printMount(mountinfo);     
      System.out.println();

      Mountdet mountain = getMinElevation(mountinfo);                         // obtain shortest mountain
      System.out.println("Shortest Mountain: " + mountain.getName());         // get's the name of the shortest mountain
      System.out.println("Elevation: " + mountain.getElevation() + " (ft)");  // get's the elevation of the shortest mountain

    }
}