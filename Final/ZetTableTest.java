

public class ZetTableTest
{
    public static void main(String[] args)
    {
        ZetTable z = new ZetTable();
        System.out.println(z.cardsInDeck());
        System.out.println(z.getOpenCard(1));
        if(z.enoughOpen())//tests simple call to make sure enough Open works, enoughOpen Works should be displayed
        {
            System.out.println("enoughOpen Works");
        }
        else
        {
            System.out.println("Enough opend doesn't work");
            
        }
        int[] i= new int[3];
           i=z.findZet();
           for(int j=0;j<i.length;j++)//test findZet
           {
               System.out.println(i[j]+" ");
            }
            if(z.open3Cards())//simple test to see if open3cards works to add cards
        {
            System.out.println("Open3Cards works\n\n");
        }
        else
        {
            System.out.println("Open3Cards doesn't work\n\n");
            
        }
        z.remove3Cards(i);
        z.compactOpenCards();
        System.out.println(z+"\nif the above (starting after the confirmation that open3Cards works) has 12 non null cards followed by all null cards, all methods have worked");//tests the remove3cards and compactOpencards, making sure the correct thing is printed
}
}
