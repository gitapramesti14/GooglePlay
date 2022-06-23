import javax.naming.Name;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JsonApi {
    public static void main(String[] args) throws IOException {
        String Download;
        String Ulasan;
        String Address;
        String Phone;

        ArrayList<Students> _StudentsTI = new ArrayList<students>();
        try {
            Students s = new Students();
            Scanner _input = new Scanner(System.in);
            System.out.println("Download : ");
            NIM = _input.nextLine();
            System.out.println("Ulasan : ");
            Name = _input.nextLine();
            System.out.println("Addres : ");
            Address = _input.nextLine();
            System.out.println("Phone : ");
            Phone = _input.nextLine();

            S.set_nim(Download);
            s.set_name(Ulasan);
            s.set_address(Address);
            s.set_phone(Phone);
            _GooglePlay.add(s);
            { catch (Exception);
                e.printStackTrace();
            }
            for(int j=0;j< _GooglePlay.size();j++){
                System.out.println(_GooglePlay.get(j).get_Download() + " - " +_GooglePlay.get(j).get_ulasan() + " - ");
                +_GooglePlay.get(j).get_addres()+ " - "+_GooglePlay.get(j).get_phone() + " - ");
            jsonStudent.put(myJobject);

            System.out.println(jsonStudent.toString());

            // send student data to database cloud
                ConnectURL myUriBuilder = new ConnectURL();
                URL myAddres = myUriBuilder.buildURL("https://gplaystore.p.rapidat.com/applicationDeetails");
                myUriBuilder.postJSON(myAddres.jsonStudent.toString());
            }


        }
    }

}
