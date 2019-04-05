import java.util.*;
class Star
{
    public Star()
    {
        try
        {
            for(int i=50;i>=1;i--)
            {
                Thread.sleep(100);
                System.out.print("*");
            }
            System.out.println();
            for(int i=5;i>=1;i--)
            {
                Thread.sleep(1000);
                if(i==5)
                {
                    System.out.println("*****  *****  ****  *****  *     ***** ' ****");
                    continue;
                }
                if(i==4)
                {
                    System.out.println("*    * *     *    * *    * *     *      *");
                    continue;
                }
                if(i==3)
                {
                    System.out.println("*****  ****  *    * *****  *     ****    ****");
                    continue;
                }
                if(i==2)
                {
                    System.out.println("*      *     *    * *      *     *           *");
                    continue;
                }
                if(i==1)
                {
                    System.out.println("*      *****  ****  *      ***** *****   ****");
                    continue;
                }
            }
            for(int i=50;i>=1;i--)
            {
                Thread.sleep(100);
                System.out.print("*");
            }
            System.out.println();
            for(int i=5;i>=1;i--)
            {
                Thread.sleep(1000);
                if(i==5)
                {
                    System.out.println("        ****      *     *     * *   *");
                    continue;
                }
                if(i==4)
                {
                    System.out.println("        *   *    * *    * *   * *  *");
                    continue;
                }
                if(i==3)
                {
                    System.out.println("        ****    *****   *  *  * ***");
                    continue;
                }
                if(i==2)
                {
                    System.out.println("        *   *  *     *  *   * * *  *");
                    continue;
                }
                if(i==1)
                {
                    System.out.println("        ****  *       * *     * *   *");
                    continue;
                }
            }
            for(int i=50;i>=1;i--)
            {
                Thread.sleep(100);
                System.out.print("*");
            }
            System.out.println();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
