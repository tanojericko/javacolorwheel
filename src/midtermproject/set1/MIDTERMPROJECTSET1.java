/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermproject.set1;
import java.util.Scanner;
/**
 *
 * @author Jericko James Tano, co authored by Arnulfo Liwanag Jr. and Nathaniel Pajinag
 */
public class MIDTERMPROJECTSET1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner myScan = new Scanner (System.in);
        

        String menu1, primarymenu, getcolops, firstcolor, secondcolor,

        hexyellow ="FEFE33", hslyellow ="(5,99%, 53%)", rgbyellow ="(254,39,18)",   //yellow
        hexblue = "0247FE", hslblue = "(224,99% 50%)", rgbblue = "(2, 71, 254)",    //blue
        hexred = "FE2717", hslred = "(5, 99%, 53%) ", rgbred = "(254, 39, 18)",     //red

        hexorange = "FB9902", rgborange = "(251, 153, 2)", hslorange = "(36, 98%, 50%)",    //orange
        hexgreen =  "66B032", rgbgreen = "(102, 176, 50)", hslgreen = "(95, 56%, 44%)",     //green
        hexpurple = "8601AF", rgbpurple = "(134, 1, 175)", hslpurple = "(286, 99%, 35%)",   //purple

        hexredorange = "FC600A", rgbredorange = "(252,96, 10)", hslredorange = "(21, 98%, 51%)",        //red orange
        hexredpurple = "C21460", rgbredpurple = "(194, 20, 96)", hslredpurple = "(334, 81%, 42%)",      //red purple
        hexyellorange = "FCCC1A", rgbyellorange = "(252, 204, 26)", hslyellorange = "(47, 97%, 55%)",   //yellow orange
        hexyellgreen = "B2D732", rgbyellgreen = "(178, 215, 50)", hslyellgreen = "(73, 67%, 52%)",      //yellow green
        hexbluegreen = "347C98", rgbbluegreen = "(52, 124, 152)", hslbluegreen = "(197, 49%, 40%)",     //blue green
        hexbluepurp = "4424D6", rgbbluepurp = "(68, 36, 214)", hslbluepurp = "(251, 71%, 49%)";         //blue pruple

        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("    A program that displays the correponding HEX, RGB, and HSL value in a RYB Wheel");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("                                    Welcome user!  ");
        System.out.println("");
        System.out.println("RYB color wheel consists with Primary, Secondary, and Tertiary color group. Secondary\nand tertiary colors can be formed by mixing right colors from primary and secondary");
        System.out.println("");
        System.out.println("Choose from the three color groups based on your needs");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.print("Type your desired color group here. The program is case sensitive\nExample: If your choosen color group is Primary, type 'Primary': ");
        menu1 = myScan.next();

        if (menu1.equals("Primary")) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("                                   Primary colors ");  
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Type 'Red' if you want to choose RED color");
            System.out.println("Type 'Yellow' if you want to choose YELLOW color");
            System.out.println("Type 'Blue' if you want to choose BLUE color");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.print("Type your desired color here. The program is case sensitive\nExample: If your choosen color is red, type 'Red': ");
            primarymenu = myScan.next();

            if (primarymenu.equals("Red")) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("                                         RED  ");  
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("There are three color formats, namely: HEX, RGB, and HSL");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.print("Type your desired color format here. The program is case sensitive\nExample: If your choosen color format is HEX, type 'HEX': ");
                getcolops = myScan.next();
                
                switch (getcolops) {
                    case "HEX":
                        System.out.println("---------------------------------------------------------------------------------------");
                        System.out.println("The HEX value of Red is: #"+ hexred);
                        System.out.println("---------------------------------------------------------------------------------------");
                        break; 
                    case "RGB":
                        System.out.println("---------------------------------------------------------------------------------------");
                        System.out.println("The RGB value of Red is: rgb"+ rgbred);
                        System.out.println("---------------------------------------------------------------------------------------");
                        break; 
                    case "HSL":
                         System.out.println("---------------------------------------------------------------------------------------");
                         System.out.println("The HSL value of Red is: hsl"+ hslred);
                         System.out.println("---------------------------------------------------------------------------------------");
                         break; 
                    default:
                         System.out.println("Check you spelling and capitalization!!Rerun the program and  try again");
                }   

            } else if (primarymenu.equals("Yellow")) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("                                         Yellow  ");  
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("There are three color formats, namely: HEX, RGB, and HSL");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.print("Type your desired color format here. The program is case sensitive\nExample: If your choosen color format is HEX, type 'HEX': ");
                getcolops = myScan.next();

                switch (getcolops) {
                    case "HEX":
                        System.out.println("---------------------------------------------------------------------------------------");
                        System.out.println("The HEX value of Yellow is: #"+ hexyellow);
                        System.out.println("---------------------------------------------------------------------------------------");
                        break; 
                    case "RGB":
                        System.out.println("---------------------------------------------------------------------------------------");
                        System.out.println("The RGB value of Yellow is: rgb"+ rgbyellow);
                        System.out.println("---------------------------------------------------------------------------------------");
                        break; 
                    case "HSL":
                         System.out.println("---------------------------------------------------------------------------------------");
                         System.out.println("The HSL value of Yellow is: hsl"+ hslyellow);
                         System.out.println("---------------------------------------------------------------------------------------");
                         break; 
                    default:
                         System.out.println("Check you spelling and capitalization!!Rerun the program and  try again");
                } 
                
            } else if (primarymenu.equals("Blue")) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("                                         Blue  ");  
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("There are three color formats, namely: HEX, RGB, and HSL");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.print("Type your desired color format here. The program is case sensitive\nExample: If your choosen color format is HEX, type 'HEX': ");
                getcolops = myScan.next();

                switch (getcolops) {
                    case "HEX":
                        System.out.println("---------------------------------------------------------------------------------------");
                        System.out.println("The HEX value of Blue is: #"+ hexblue);
                        System.out.println("---------------------------------------------------------------------------------------");
                        break; 
                    case "RGB":
                        System.out.println("---------------------------------------------------------------------------------------");
                        System.out.println("The RGB value of Blue is: rgb"+ rgbblue);
                        System.out.println("---------------------------------------------------------------------------------------");
                        break; 
                    case "HSL":
                         System.out.println("---------------------------------------------------------------------------------------");
                         System.out.println("The HSL value of Blue is: hsl"+ hslblue);
                         System.out.println("---------------------------------------------------------------------------------------");
                         break; 
                    default:
                         System.out.println("Check you spelling and capitalization!!Rerun the program and  try again");
                } 
            } else {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("You either inputted wrong color/s or wrong spelling/capitalization. Please double check.\nThe program will run again!");
                main(args);
            }

        } else if (menu1.equals("Secondary")) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("                                  Secondary colors "); 
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("To make secondary colors, you need to mix two compatible colors from primary. \nPrimary colors are Red, Yellow, and Blue");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("The program is case sensitive. Example: If your choosen color is Yellow, type 'Yellow': ");
            System.out.print("Enter 1st primary color: ");
            firstcolor = myScan.next();
            System.out.print("Enter 2nd primary color: ");
            secondcolor = myScan.next();
        
            if (firstcolor.equals("Red") && secondcolor.equals("Yellow") || firstcolor.equals("Yellow") && secondcolor.equals("Red")) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("                  The 2 primary colors that mixed turned into Orange! "); 
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("There are three color formats, namely: HEX, RGB, and HSL");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.print("Type you desired color format here. The program is case sensitive\nExample: If your choosen color format is HEX, type 'HEX': ");
                getcolops = myScan.next();

                switch (getcolops) {
                    case "HEX":
                        System.out.println("---------------------------------------------------------------------------------------");
                        System.out.println("The HEX value of Orange is: #"+ hexorange);
                        System.out.println("---------------------------------------------------------------------------------------");
                        break; 
                    case "RGB":
                        System.out.println("---------------------------------------------------------------------------------------");
                        System.out.println("The RGB value of Orange is: rgb"+ rgborange);
                        System.out.println("---------------------------------------------------------------------------------------");
                        break; 
                    case "HSL":
                         System.out.println("---------------------------------------------------------------------------------------");
                         System.out.println("The HSL value of Orange is: hsl"+ hslorange);
                         System.out.println("---------------------------------------------------------------------------------------");
                         break; 
                    default:
                         System.out.println("Check you spelling and capitalization!!Rerun the program and try again");

                } 
                
            } else if (firstcolor.equals("Red") && secondcolor.equals("Blue") || firstcolor.equals("Blue") && secondcolor.equals("Red")) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("                  The 2 primary colors that mixed turned into Purple! "); 
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("There are three color formats, namely: HEX, RGB, and HSL");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.print("Type you desired color format here. The program is case sensitive\nExample: If your choosen color format is HEX, type 'HEX': ");
                getcolops = myScan.next(); 

                switch (getcolops) {
                    case "HEX":
                        System.out.println("---------------------------------------------------------------------------------------");
                        System.out.println("The HEX value of Purple is: #"+ hexpurple);
                        System.out.println("---------------------------------------------------------------------------------------");
                        break; 
                    case "RGB":
                        System.out.println("---------------------------------------------------------------------------------------");
                        System.out.println("The RGB value of Purple is: rgb"+ rgbpurple);
                        System.out.println("---------------------------------------------------------------------------------------");
                        break; 
                    case "HSL":
                         System.out.println("---------------------------------------------------------------------------------------");
                         System.out.println("The HSL value of Purple is: hsl"+ hslpurple);
                         System.out.println("---------------------------------------------------------------------------------------");
                         break; 
                    default:
                         System.out.println("Check your spelling and capitalization!!Rerun the program and try again");
                } 

            } else if (firstcolor.equals("Yellow") && secondcolor.equals("Blue") || firstcolor.equals("Blue") && secondcolor.equals("Yellow")) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("                  The 2 primary colors that mixed turned into Green! "); 
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("There are three color formats, namely: HEX, RGB, and HSL");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.print("Type your desired color format here. The program is case sensitive\nExample: If your choosen color format is HEX, type 'HEX': ");
                getcolops = myScan.next(); 

                switch (getcolops) {
                    case "HEX":
                        System.out.println("---------------------------------------------------------------------------------------");
                        System.out.println("The HEX value of Green is: #"+ hexgreen);
                        System.out.println("---------------------------------------------------------------------------------------");
                        break; 
                    case "RGB":
                        System.out.println("---------------------------------------------------------------------------------------");
                        System.out.println("The RGB value of Green is: rgb"+ rgbgreen);
                        System.out.println("---------------------------------------------------------------------------------------");
                        break; 
                    case "HSL":
                         System.out.println("---------------------------------------------------------------------------------------");
                         System.out.println("The HSL value of Green is: hsl"+ hslgreen);
                         System.out.println("---------------------------------------------------------------------------------------");
                         break; 
                    default:
                         System.out.println("Check your spelling and capitalization!!Rerun the program and try again");
                } 

            } else if (firstcolor.equals("Red") && secondcolor.equals("Red") ) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("            You entered the same Primary colors! No new colors are formed "); 
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("Enter two different primary colors to form a new color. Try again!");
                main(args);

            } else if (firstcolor.equals("Yellow") && secondcolor.equals("Yellow") ) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("            You entered the same Primary colors! No new colors are formed "); 
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("Enter two different primary colors to form a new color. Try again!");
                main(args);

            } else if (firstcolor.equals("Blue") && secondcolor.equals("Blue") ) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("            You entered the same Primary colors! No new colors are formed "); 
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("Enter two different primary colors to form a new color. Try again!");
                main(args);

            } else {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("You either inputted wrong spelling/capitalization. Please\ndouble check. The program will run again!");
                main(args);
            }

        } else if (menu1.equals("Tertiary")) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("                                  Tertiary colors "); 
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("To make tertiary color, you need to mix two compatible colors from primary and secondary\ncolors. Primary colors are Red, Yellow, and Blue and Secondary colors are Green, Orange\nand Purple");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("The program is case sensitive. Example: If your choosen color is Yellow, type 'Yellow': ");
            System.out.print("Enter primary color: ");
            firstcolor = myScan.next();
            System.out.print("Enter secondary color: ");
            secondcolor = myScan.next();
            
           if (firstcolor.equals("Red") && secondcolor.equals("Orange") || firstcolor.equals("Orange") && secondcolor.equals("Red")) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("           The primary and secondary colors that mixed turned into Red Orange!         "); 
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("There are three color formats, namely: HEX, RGB, and HSL");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.print("Type your desired color format here. The program is case sensitive\nExample: If your choosen color format is HEX, type 'HEX': ");
            getcolops = myScan.next(); 

            switch (getcolops) {
                case "HEX":
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("The HEX value of Blue is: #"+ hexredorange);
                    System.out.println("---------------------------------------------------------------------------------------");
                    break; 
                case "RGB":
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("The RGB value of Blue is: rgb"+ rgbredorange);
                    System.out.println("---------------------------------------------------------------------------------------");
                    break; 
                case "HSL":
                     System.out.println("---------------------------------------------------------------------------------------");
                     System.out.println("The HSL value of Blue is: hsl"+ hslredorange);
                     System.out.println("---------------------------------------------------------------------------------------");
                     break; 
                default:
                     System.out.println("Check your spelling and capitalization!!Rerun the program and try again");
 
            } 

           } else if (firstcolor.equals("Red") && secondcolor.equals("Purple") || firstcolor.equals("Purple") && secondcolor.equals("Red")) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("           The primary and secondary colors that mixed turned into Red Purple!         "); 
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("There are three color formats, namely: HEX, RGB, and HSL");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.print("Type your desired color format here. The program is case sensitive\nExample: If your choosen color format is HEX, type 'HEX': ");
            getcolops = myScan.next(); 

            switch (getcolops) {
                case "HEX":
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("The HEX value of Red Purple is: #"+ hexredpurple);
                    System.out.println("---------------------------------------------------------------------------------------");
                    break; 
                case "RGB":
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("The RGB value of Red Purple is: rgb"+ rgbredpurple);
                    System.out.println("---------------------------------------------------------------------------------------");
                    break; 
                case "HSL":
                     System.out.println("---------------------------------------------------------------------------------------");
                     System.out.println("The HSL value of Red Purple is: hsl"+ hslredpurple);
                     System.out.println("---------------------------------------------------------------------------------------");
                     break; 
                default:
                     System.out.println("Check your spelling and capitalization!!Rerun the program and try again");
 
            } 

           } else if (firstcolor.equals("Yellow") && secondcolor.equals("Orange") || firstcolor.equals("Orange") && secondcolor.equals("Yellow")) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("         The primary and secondary colors that mixed turned into Yellow Orange!        "); 
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("There are three color formats, namely: HEX, RGB, and HSL");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.print("Type your desired color format here. The program is case sensitive\nExample: If your choosen color format is HEX, type 'HEX': ");
            getcolops = myScan.next(); 

            switch (getcolops) {
                case "HEX":
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("The HEX value of Yellow Orange is: #"+ hexyellorange);
                    System.out.println("---------------------------------------------------------------------------------------");
                    break; 
                case "RGB":
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("The RGB value of Yellow Orange is: rgb"+ rgbyellorange);
                    System.out.println("---------------------------------------------------------------------------------------");
                    break; 
                case "HSL":
                     System.out.println("---------------------------------------------------------------------------------------");
                     System.out.println("The HSL value of Yellow Orange is: hsl"+ hslyellorange);
                     System.out.println("---------------------------------------------------------------------------------------");
                     break; 
                default:
                     System.out.println("Check your spelling and capitalization!!Rerun the program and try again");
 
            } 

           } else if (firstcolor.equals("Yellow") && secondcolor.equals("Green") || firstcolor.equals("Green") && secondcolor.equals("Yellow")) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("         The primary and secondary colors that mixed turned into Yellow Green!         "); 
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("There are three color formats, namely: HEX, RGB, and HSL");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.print("Type your desired color format here. The program is case sensitive\nExample: If your choosen color format is HEX, type 'HEX': ");
            getcolops = myScan.next(); 

            switch (getcolops) {
                case "HEX":
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("The HEX value of Yellow Green is: #"+ hexyellgreen);
                    System.out.println("---------------------------------------------------------------------------------------");
                    break; 
                case "RGB":
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("The RGB value of Yellow Green is: rgb"+ rgbyellgreen);
                    System.out.println("---------------------------------------------------------------------------------------");
                    break; 
                case "HSL":
                     System.out.println("---------------------------------------------------------------------------------------");
                     System.out.println("The HSL value of Yellow Green is: hsl"+ hslyellgreen);
                     System.out.println("---------------------------------------------------------------------------------------");
                     break; 
                default:
                     System.out.println("Check your spelling and capitalization!!Rerun the program and try again");
 
            } 

           } else if (firstcolor.equals("Blue") && secondcolor.equals("Green") || firstcolor.equals("Green") && secondcolor.equals("Blue")) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("         The primary and secondary colors that mixed turned into Blue Green!           "); 
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("There are three color formats, namely: HEX, RGB, and HSL");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.print("Type your desired color format here. The program is case sensitive\nExample: If your choosen color format is HEX, type 'HEX': ");
            getcolops = myScan.next(); 

            switch (getcolops) {
                case "HEX":
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("The HEX value of Blue Green is: #"+ hexbluegreen);
                    System.out.println("---------------------------------------------------------------------------------------");
                    break; 
                case "RGB":
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("The RGB value of Blue Green is: rgb"+ rgbbluegreen);
                    System.out.println("---------------------------------------------------------------------------------------");
                    break; 
                case "HSL":
                     System.out.println("---------------------------------------------------------------------------------------");
                     System.out.println("The HSL value of Blue Green is: hsl"+ hslbluegreen);
                     System.out.println("---------------------------------------------------------------------------------------");
                     break; 
                default:
                     System.out.println("Check your spelling and capitalization!!Rerun the program and try again");
 
            }

           } else if (firstcolor.equals("Blue") && secondcolor.equals("Purple") || firstcolor.equals("Purple") && secondcolor.equals("Blue")) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("         The primary and secondary colors that mixed turned into Blue Purple!           "); 
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("There are three color formats, namely: HEX, RGB, and HSL");
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.print("Type your desired color format here. The program is case sensitive\nExample: If your choosen color format is HEX, type 'HEX': ");
            getcolops = myScan.next(); 

            switch (getcolops) {
                case "HEX":
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("The HEX value of Blue Purple is: #"+ hexbluepurp);
                    System.out.println("---------------------------------------------------------------------------------------");
                    break; 
                case "RGB":
                    System.out.println("---------------------------------------------------------------------------------------");
                    System.out.println("The RGB value of Blue Purple is: rgb"+ rgbbluepurp);
                    System.out.println("---------------------------------------------------------------------------------------");
                    break; 
                case "HSL":
                     System.out.println("---------------------------------------------------------------------------------------");
                     System.out.println("The HSL value of Blue Purple is: hsl"+ hslbluepurp);
                     System.out.println("---------------------------------------------------------------------------------------");
                     break; 
                default:
                     System.out.println("Check your spelling and capitalization!!Rerun the program and try again");
 
            }

           } else if (firstcolor.equals("Red") && secondcolor.equals("Green") || firstcolor.equals("Green") && secondcolor.equals("Red")) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("     The primary and secondary colors are not compatible in the RYB Color Wheel. "); 
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Enter two different primary colors to form a new color. Try again!");
            main(args);

           } else if (firstcolor.equals("Yellow") && secondcolor.equals("Purple") || firstcolor.equals("Purple") && secondcolor.equals("Yellow")) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("     The primary and secondary colors are not compatible in the RYB Color Wheel. "); 
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Enter two different primary colors to form a new color. Try again!");
            main(args);

           } else if (firstcolor.equals("Yellow") && secondcolor.equals("Purple") || firstcolor.equals("Purple") && secondcolor.equals("Yellow")) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("     The primary and secondary colors are not compatible in the RYB Color Wheel. "); 
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Enter two different primary colors to form a new color. Try again!");
            main(args);

           } else if (firstcolor.equals("Blue") && secondcolor.equals("Orange") || firstcolor.equals("Orange") && secondcolor.equals("Blue")) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("     The primary and secondary colors are not compatible in the RYB Color Wheel. "); 
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Enter two different primary colors to form a new color. Try again!");
            main(args);

           } else if (firstcolor.equals("Red") && secondcolor.equals("Red") || firstcolor.equals("Yellow") && secondcolor.equals("Yellow") || firstcolor.equals("Blue") && secondcolor.equals("Blue")) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("            You entered the same Primary colors! No new colors are formed "); 
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Enter two different compatible colors to form a new color. Try again!");
            main(args);
            
           } else if (firstcolor.equals("Orange") && secondcolor.equals("Orange") || firstcolor.equals("Green") && secondcolor.equals("Green") || firstcolor.equals("Purple") && secondcolor.equals("Purple")) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("            You entered the same Secondary colors! No new colors are formed "); 
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Enter two different compatible colors to form a new color. Try again!");
            main(args);
            
           } else {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("You either inputted wrong spelling/capitalization. Please\ndouble check. The program will run again!");
            main(args);
           }

        } else {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Please double check your spelling/capitalization. The program will run again ");
            main(args);
        }
    
    myScan.close();
    }
    
}
                                                                                                      

