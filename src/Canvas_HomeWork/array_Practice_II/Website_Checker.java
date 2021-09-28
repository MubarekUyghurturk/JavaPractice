package Canvas_HomeWork.array_Practice_II;

public class Website_Checker {
    public static void main(String[] args) {
        /*
        Website checker
        Given some urls determine how many .com, .org, and .edu websites there are.Also keep track of an ‘other’category for websites that have a different domain.
        Sample websites for an array:
        bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com, nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com, comcast.net, tamu.edu, utexas.edu, */

        String[] websites = { "bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu",};
        int countCom = 0;
        int countOrg = 0;
        int countEdu = 0;
        for (String website : websites) {


           // System.out.print(website + " ");

            if (website.contains(".com")){//7
                ++countCom;
            }
            else if (website.contains(".org")){//2
                ++countOrg;
            }
            else if (website.contains("edu")){//3
               ++countEdu;
            }
            else {
                System.out.print(website+ " ");
            }
        }
        System.out.println();
        System.out.println("There are " + countCom +" \'.com\' website");
        System.out.println("There are " + countOrg +" \'.org\' website");
        System.out.println("There are " + countEdu +" \'.edu\' website");

    }
}
