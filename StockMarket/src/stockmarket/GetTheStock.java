/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stockmarket;

import java.text.DecimalFormat;
import java.io.IOException;
import java.io.BufferedReader;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Grant
 */
public class GetTheStock implements Runnable{
    private int startTime;
    private String stock;
    
    
    private Subject stockGrabber;
    
    public GetTheStock(Subject stockGrabber, int newStartTime, String newStock){
        this.stockGrabber = stockGrabber;
        startTime = newStartTime;
        stock = newStock;
      
    }

    @Override
    public void run() {
        for(int i = 1;i<=20;i++){
            try{
                Thread.sleep(2000);//every 2 seconds an automatic updat eon prices happen
            }
            catch(InterruptedException e){}
            
            URL url = null;
try{
if(stock.equals("GOOG")){//get the URL of the stock we are trying to find
    url = new URL("https://www.google.com/search?q=google+stock&source=hp&ei=WHVMYs-YFsjXtAa-9rnQBA&iflsig=AHkkrS4AAAAAYkyDaFrsN9hPPfMNSgnyGabzuIr794Lh&ved=0ahUKEwjPpK7Msv32AhXIK80KHT57DkoQ4dUDCAk&uact=5&oq=google+stock&gs_lcp=Cgdnd3Mtd2l6EAMyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATIICAAQgAQQsQMyCAgAEIAEELEDMgsIABCABBCxAxCDATIICAAQgAQQsQMyCAgAEIAEELEDMgUIABCABDIFCAAQgAQyBQgAEIAEOhEILhCABBCxAxCDARDHARDRAzoICAAQsQMQgwE6DgguEIAEELEDEMcBEKMCOggILhCxAxCDAToOCAAQgAQQsQMQgwEQyQM6BQgAEJIDOg4ILhCABBCxAxDHARDRA1AAWPQJYIwMaABwAHgAgAFiiAHBB5IBAjEymAEAoAEB&sclient=gws-wiz");
}
    
 if(stock.equals("AAPL")){
     
     url = new URL("https://www.google.com/search?q=apple+stock&biw=1536&bih=792&ei=Z35MYr70OtLQ9APF3ZmACA&ved=0ahUKEwj-w7eeu_32AhVSKH0KHcVuBoAQ4dUDCA4&uact=5&oq=apple+stock&gs_lcp=Cgdnd3Mtd2l6EAMyDwgAELEDEIMBEEMQRhD6ATILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATIICAAQgAQQsQMyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCAgAEIAEELEDMgUIABCABDoECAAQQzoQCC4QsQMQgwEQxwEQ0QMQQzoQCC4QsQMQxwEQowIQ1AIQQzoKCAAQsQMQgwEQQzoNCC4QsQMQxwEQowIQCjoRCC4QgAQQsQMQxwEQowIQ1AI6DgguEIAEELEDEMcBEKMCOggIABCABBDJAzoFCAAQkgNKBAhBGABKBAhGGABQAFiBCWDuCmgAcAF4AYAB8gGIAZQIkgEGMTAuMC4xmAEAoAEBwAEB&sclient=gws-wiz");
 }
 if(stock.equals("IBM")){
     url = new URL("https://www.google.com/search?q=IBM+stock&biw=1536&bih=792&ei=bH5MYu4N-8vQ8Q_7k5_IDw&ved=0ahUKEwju862gu_32AhX7JTQIHfvJB_kQ4dUDCA4&uact=5&oq=IBM+stock&gs_lcp=Cgdnd3Mtd2l6EAMyDwgAELEDEIMBEEMQRhD6ATILCAAQgAQQsQMQgwEyCAgAEIAEELEDMgQIABBDMgUIABCABDILCAAQgAQQsQMQgwEyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOgoILhDHARDRAxBDOg4ILhCABBCxAxDHARCjAjoRCC4QgAQQsQMQgwEQxwEQowI6CggAELEDEIMBEEM6DQguELEDEMcBEKMCEEM6BwgAELEDEENKBAhBGABKBAhGGABQAFjtDGD4DmgAcAF4AIABY4gB7AWSAQE5mAEAoAEBwAEB&sclient=gws-wiz");
 }
 if(stock.equals("TWTR")){
     url = new URL("https://www.google.com/search?q=twitter+stock&biw=1536&bih=792&ei=3YhMYtDXIfaP9PwP9ImW6AM&ved=0ahUKEwiQupqbxf32AhX2B50JHfSEBT0Q4dUDCA4&uact=5&oq=twitter+stock&gs_lcp=Cgdnd3Mtd2l6EAMyEAgAELEDEIMBEJECEEYQ-gEyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwE6DgguELEDEIMBEMcBENEDOgsILhCxAxCDARDUAjoECAAQQzoOCC4QgAQQsQMQxwEQowI6CAgAELEDEIMBOgsILhCABBDHARCvAToICC4QgAQQsQM6CAgAEIAEELEDOgUIABCRAjoKCAAQsQMQgwEQQzoOCC4QgAQQsQMQxwEQ0QM6DQguELEDEMcBENEDEEM6BwgAEMkDEEM6CgguELEDENQCEEM6EQguEIAEELEDEIMBEMcBENEDOgsIABCxAxCDARCRAjoLCC4QgAQQxwEQ0QM6EQguEIAEELEDEIMBEMcBEKMCOgUIABCABDoHCAAQgAQQCjoKCAAQgAQQsQMQCjoKCC4QxwEQowIQQzoQCC4QsQMQxwEQowIQ1AIQQzoHCAAQsQMQQzoKCC4QxwEQ0QMQQ0oECEEYAEoECEYYAFAAWO4nYPgpaBBwAXgAgAGFAYgBwxKSAQQxOC45mAEAoAEBsAEAwAEB&sclient=gws-wiz");
 }
 if(stock.equals("AMZN")){
     url = new URL("https://www.google.com/search?q=amazon+stock&source=hp&ei=LYlMYrWmOeW60PEPjdezsAU&iflsig=AHkkrS4AAAAAYkyXPQ_xKqEldgQul3XOoU9kNOsW8uOt&ved=0ahUKEwj18MTBxf32AhVlHTQIHY3rDFYQ4dUDCAk&uact=5&oq=amazon+stock&gs_lcp=Cgdnd3Mtd2l6EAMyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCAgAEIAEELEDMggIABCABBCxAzIICAAQgAQQsQMyCAgAEIAEELEDOhEILhCABBCxAxCDARDHARDRAzoOCC4QgAQQsQMQxwEQ0QM6DgguEIAEELEDEMcBEKMCOgUIABCABDoRCC4QgAQQsQMQxwEQowIQ1AI6CwguEIAEEMcBEKMCOhEILhCABBCxAxCDARDHARCjAjoICC4QgAQQsQM6CwgAEIAEELEDEMkDOgUIABCSAzoRCC4QgAQQsQMQxwEQ0QMQ1AI6CAgAEIAEEMkDUNgCWLcNYJAPaAFwAHgAgAGrAYgBrAiSAQQxMC4ymAEAoAEBsAEA&sclient=gws-wiz");
 }
    
    
    
    
    
    
     URLConnection urlCon = url.openConnection();
        urlCon.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");//open up it's contents and read through it
        InputStreamReader inStream = new InputStreamReader(urlCon.getInputStream());
        BufferedReader buff = new BufferedReader(inStream);
        String price = "Not Found";
        String line = buff.readLine();
        while(line!=null){
         //   System.out.println(line);
            if(line.contains("Price")){//keep reading until you see the word "price"
                System.out.println("Found something");
                int target = line.indexOf("Price");
                int deci = line.indexOf(".",target);//and grab the price
                int start = deci;
                while(line.charAt(start)!='>'){
                    start--;
                }
                price = line.substring(start+1,deci+3);
                break;
            }
            line = buff.readLine();
        }
       
    price = price.replace(",","");
    double Dprice = Double.parseDouble(price);
         
    

   
      DecimalFormat df = new DecimalFormat("#.##");
            if(stock.equals("IBM"))((StockGrabber)stockGrabber).setIBMPrice(Dprice);//and update it
            
            if(stock.equals("AAPL"))((StockGrabber)stockGrabber).setaaplPrice(Dprice);
            
            if(stock.equals("GOOG"))((StockGrabber)stockGrabber).setgoogPrice(Dprice);
            
            if(stock.equals("TWTR"))((StockGrabber)stockGrabber).setSafePrice(Dprice);
            
            if(stock.equals("AMZN"))((StockGrabber)stockGrabber).setRiskyPrice(Dprice);
            System.out.println(stock + " : "+df.format((Dprice)));
            System.out.println();
    
    
    
    
}           catch (IOException ex) {
                Logger.getLogger(GetTheStock.class.getName()).log(Level.SEVERE, null, ex);
            }
}


            





            
          
    }
}

