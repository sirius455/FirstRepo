package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E03_SaveGame_ex {

        /*
                 1. 컴퓨터와 진행하는 간단한 가위바위보 게임을 만들어 보세요
                 
                         - 처음 시작하면 이름을 입력함 
                         - 프로그램 종료시 플레이어의 전적을 파일에 저장함 
                           (저장할 때 파일명은 이름.txt)                     
         
                 2. 프로그램 실행시 이름을 입력했을 때 해당 전적이 있다면
                    전적을 불러온 후 진행되도록 만들어보세요
        */
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                
                int win = 300;
                int lose = 300;
                
                System.out.print("먼저 이름을 입력해주세요 >> ");
                String userName = sc.nextLine();
                
                File save = new File("./data/" + userName + ".hz");
                
                if (save.exists()) {
                        System.out.println("[System] 불러올 파일이 있습니다.");
                        
                        try {
                                FileInputStream fin = new FileInputStream(save);
                                
                                win = fin.read();
                                lose = fin.read();
                                
                                System.out.printf("불러온 정보 - %d승 %d패\n", win, lose);
                                
                                fin.close();
                        } catch (FileNotFoundException e) {                                
                                e.printStackTrace();
                        } catch (IOException e) {                                
                                e.printStackTrace();
                        }
                        
                } else {
                        System.out.println("[System] 불러올 파일이 없습니다.");
                }
                
                while (true) {
                        int answer = (int)(Math.random() * 2);
                        
                        System.out.print("0, 1 > ");
                        int user = sc.nextInt();
                        
                        if (user != -1 && user != 0 && user != 1) {
                                System.out.println("똑바로 다시 입력해주세요!");
                                continue;
                        }
                        
                        if (user == -1) {
                                System.out.println("플레이 해주셔서 감사합니다!");
                                break;
                        }
                        
                        if (user != answer) {
                                System.out.println("졌습니다.");
                                lose++;
                        } else {
                                System.out.println("당첨!");
                                win++;
                        }
                }                
                
                try {
                        FileOutputStream fout = new FileOutputStream(save);
                        
                        fout.write(win);
                        fout.write(lose);
                        
                        fout.close();
                } catch (FileNotFoundException e) {                        
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }                
                
        }
        
}
