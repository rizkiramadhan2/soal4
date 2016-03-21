import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Scanner in2 = new Scanner (System.in);
        Member m1 = new Member();
        Member m2 = new Member();
        Member m3 = new Member();
        Member m4 = new Member();
        ArrayList <Member> member  = new ArrayList<>(); 
        member.add(m1);
        member.add(m2);
        member.add(m3);
        member.add(m4);
        System.out.println("=====================Daftar Member=======================");
        for(int i = 0;i<member.size();i++){
            System.out.print("Nama : ");
            member.get(i).setNama(in.nextLine());
            System.out.print("Team : ");
            member.get(i).setTeam(in.nextLine());
            System.out.print("Umur : ");
            member.get(i).setUmur(in.nextLine());
            System.out.print("Nilai penampilan : ");
            member.get(i).setPenampilan(in2.nextDouble());
            System.out.print("Nilai suara      : ");
            member.get(i).setSuara(in2.nextDouble());
            System.out.print("Nilai attitude   : ");  
            member.get(i).setAttitude(in2.nextDouble());
            System.out.println("======================================================");
        }
        System.out.println("         Daftar member dan nilai rata-ratanya");
        System.out.println("======================================================");
        for(int i =0;i<member.size();i++){
            System.out.println("Nama            : "+member.get(i).getNama());
            System.out.println("Team            : "+member.get(i).getTeam());
            System.out.println("Umur            : "+member.get(i).getUmur());
            System.out.println("Nilai rata-rata : "+member.get(i).getNilai());
            System.out.println("======================================================");   
        }       
    }
}
