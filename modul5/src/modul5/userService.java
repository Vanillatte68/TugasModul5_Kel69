/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author ASUS
 */
public class userService {
private String[][] data = new String[2][3];
private String[][] histories = new String [2][4];
    private String email, password, roles = "";
    
    //ini namanya constructor yang akan dijalankan setiap class diinisialisasikan
    public userService(String emails, String passwords)
    {
        email = emails;
        password = passwords;
        String[][] data = 
        { 
            {"nama1kelompok69@gmail.com", "12345", "superAdmin"},
            {"nama2kelompok69@gmail.com", "12345", "user"} 
        };
        this.data = data;
        String[][] histories =
        {
            {"Fisika Dasar", "Dasar Komputer dan Pemrograman", "dd-mm-yy"},
            {"Dasar Komputer dan Pemrograman", "Konsep Jaringan Komputer", "dd-mm-yy"}
        };
        this.histories = histories; 
    }
    
    private boolean checkCredential()
    {
        for(int i = 0; i < data.length; i++ )
        {
            if(data[i][0].equals(email))
            {
                if(data[i][1].equals(password))
                {
                    roles = data[i][2];
                    return true;
                }
            }
        }
        return false;
    }
    
    public void login()
    {
        boolean status = checkCredential();
        if(status == true)
        {
            System.out.println("\nWelcome " + roles);
            System.out.println("Logged it as user email " + email);
            if(roles.equals(data[0][2])){
                for(int i = 0; i < 2; i++)
                {
                    System.out.println(histories[0][i]);
                }
                System.out.println("Tanggal peminjaman :" + (histories[0][2]));
            }
            else
            {
                for(int i = 0; i < 2; i++)
                {
                    System.out.println(histories[1][i]);
                }
                System.out.println("Tanggal peminjaman :" + (histories[1][2]));
            }
        }
        else
        {
            System.out.println("\nInvalid Login ");
        }
    }
}
