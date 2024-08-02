import java.util.Scanner;

public class TowerOfHanoi {
    public static void Tower(int disks, char s, char h, char d){
        if(disks==1){
            System.out.println("move 1st disk from " + s+ " to " + d);
            return;
        }
        //move total disks -1 from source to helper using destination as helper
        Tower(disks-1,s,d,h);
// Move last disk from source to destitation using helper
        System.out.println("move "+ disks+ " disk from " + s+ " to " + d);
        //Move total disks -1 from helper to destitation using source as helper
        Tower(disks-1,h,s,d);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of disks :");
        int disks = sc.nextInt();
        Tower(disks,'A','B','C');

    }
}
