//Submitted by: Laura Neff

public class MagicTrick {
    public static void main(String[] args) {
        int a  = Integer.parseInt(args[0]);
        int b  = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a > b && b > c)
        {
            String Number = (a + "" + b + "" + c);
            System.out.println("Number: " + a + "" + b + "" + c);
            String ReverseNumber = (Number.charAt(2) + "" + Number.charAt(1) + "" + Number.charAt(0));
            int NumberInt =  Integer.parseInt(Number);
            int ReverseNumberInt = Integer.parseInt(ReverseNumber);
            if (NumberInt > ReverseNumberInt)
            {
                int Difference = (NumberInt - ReverseNumberInt);
                System.out.println(Number + " - " + ReverseNumber + " = " + Difference);
                String DifferenceString = Integer.toString(Difference);
                String ReverseDifference = (DifferenceString.charAt(2) + "" + DifferenceString.charAt(1) + "" + DifferenceString.charAt(0));
                int ReverseDifferenceInt = Integer.parseInt(ReverseDifference);
                int AddedDifferences = (ReverseDifferenceInt +  Difference);
                String AddedDifferencesString = Integer.toString(AddedDifferences);
                System.out.println(DifferenceString + " + " + ReverseDifference + " = " +  AddedDifferencesString);
            } else {
                int Difference = (ReverseNumberInt - NumberInt);
                System.out.println(ReverseNumber + " - " + Number + " = " + Difference);
                String DifferenceString = Integer.toString(Difference);
                String ReverseDifference = (DifferenceString.charAt(2) + "" + DifferenceString.charAt(1) + "" + DifferenceString.charAt(0));
                int ReverseDifferenceInt = Integer.parseInt(ReverseDifference);
                int AddedDifferences = (ReverseDifferenceInt + Difference);
                String AddedDifferencesString = Integer.toString(AddedDifferences);
                System.out.println(DifferenceString + " + " + ReverseDifference + " = " + AddedDifferencesString);
            }
        } else if (b > a && a > c)
        {
            System.out.println("Number: " + b + "" + a + "" + c);
            String Number = (b + "" + "" + a + "" + c);
            String ReverseNumber = (Number.charAt(2) + "" + Number.charAt(1) + "" + Number.charAt(0));
            int NumberInt =  Integer.parseInt(Number);
            int ReverseNumberInt = Integer.parseInt(ReverseNumber);
            if (NumberInt > ReverseNumberInt)
            {
                int Difference = (NumberInt - ReverseNumberInt);
                System.out.println(Number + " - " + ReverseNumber + " = " + Difference);
                String DifferenceString = Integer.toString(Difference);
                String ReverseDifference = (DifferenceString.charAt(2) + "" + DifferenceString.charAt(1) + "" + DifferenceString.charAt(0));
                int ReverseDifferenceInt = Integer.parseInt(ReverseDifference);
                int AddedDifferences = (ReverseDifferenceInt +  Difference);
                String AddedDifferencesString = Integer.toString(AddedDifferences);
                System.out.println(DifferenceString + " + " + ReverseDifference + " = " +  AddedDifferencesString);
            } else {
                int Difference = (ReverseNumberInt - NumberInt);
                System.out.println(ReverseNumber + " - " + Number + " = " + Difference);
                String DifferenceString = Integer.toString(Difference);
                String ReverseDifference = (DifferenceString.charAt(2) + "" + DifferenceString.charAt(1) + "" + DifferenceString.charAt(0));
                int ReverseDifferenceInt = Integer.parseInt(ReverseDifference);
                int AddedDifferences = (ReverseDifferenceInt + Difference);
                String AddedDifferencesString = Integer.toString(AddedDifferences);
                System.out.println(DifferenceString + " + " + ReverseDifference + " = " + AddedDifferencesString);
            }
        } else if (c > b && b > a) {
            String Number = (c + "" + b + "" + a);
            System.out.println("Number: " + c + "" + b + "" + a);
            String ReverseNumber = (Number.charAt(2) + "" + Number.charAt(1) + "" + Number.charAt(0));
            int NumberInt =  Integer.parseInt(Number);
            int ReverseNumberInt = Integer.parseInt(ReverseNumber);
            if (NumberInt > ReverseNumberInt)
            {
                int Difference = (NumberInt - ReverseNumberInt);
                System.out.println(Number + " - " + ReverseNumber + " = " + Difference);
                String DifferenceString = Integer.toString(Difference);
                String ReverseDifference = (DifferenceString.charAt(2) + "" + DifferenceString.charAt(1) + "" + DifferenceString.charAt(0));
                int ReverseDifferenceInt = Integer.parseInt(ReverseDifference);
                int AddedDifferences = (ReverseDifferenceInt +  Difference);
                String AddedDifferencesString = Integer.toString(AddedDifferences);
                System.out.println(DifferenceString + " + " + ReverseDifference + " = " +  AddedDifferencesString);
            } else {
                int Difference = (ReverseNumberInt - NumberInt);
                System.out.println(ReverseNumber + " - " + Number + " = " + Difference);
                String DifferenceString = Integer.toString(Difference);
                String ReverseDifference = (DifferenceString.charAt(2) + "" + DifferenceString.charAt(1) + "" + DifferenceString.charAt(0));
                int ReverseDifferenceInt = Integer.parseInt(ReverseDifference);
                int AddedDifferences = (ReverseDifferenceInt + Difference);
                String AddedDifferencesString = Integer.toString(AddedDifferences);
                System.out.println(DifferenceString + " + " + ReverseDifference + " = " + AddedDifferencesString);
            }
        } else if (b > c && c > a)
        {
            String Number = (b + "" + c + "" + a);
            System.out.println("Number: " + b + "" + c + "" + a);
            String ReverseNumber = (Number.charAt(2) + "" + Number.charAt(1) + "" + Number.charAt(0));
            int NumberInt =  Integer.parseInt(Number);
            int ReverseNumberInt = Integer.parseInt(ReverseNumber);
            if (NumberInt > ReverseNumberInt)
            {
                int Difference = (NumberInt - ReverseNumberInt);
                System.out.println(Number + " - " + ReverseNumber + " = " + Difference);
                String DifferenceString = Integer.toString(Difference);
                String ReverseDifference = (DifferenceString.charAt(2) + "" + DifferenceString.charAt(1) + "" + DifferenceString.charAt(0));
                int ReverseDifferenceInt = Integer.parseInt(ReverseDifference);
                int AddedDifferences = (ReverseDifferenceInt +  Difference);
                String AddedDifferencesString = Integer.toString(AddedDifferences);
                System.out.println(DifferenceString + " + " + ReverseDifference + " = " +  AddedDifferencesString);
            } else {
                int Difference = (ReverseNumberInt - NumberInt);
                System.out.println(ReverseNumber + " - " + Number + " = " + Difference);
                String DifferenceString = Integer.toString(Difference);
                String ReverseDifference = (DifferenceString.charAt(2) + "" + DifferenceString.charAt(1) + "" + DifferenceString.charAt(0));
                int ReverseDifferenceInt = Integer.parseInt(ReverseDifference);
                int AddedDifferences = (ReverseDifferenceInt + Difference);
                String AddedDifferencesString = Integer.toString(AddedDifferences);
                System.out.println(DifferenceString + " + " + ReverseDifference + " = " + AddedDifferencesString);
            }
        } else if (a > c && c > b)
        {
            String Number = (a + "" + c + "" + b);
            System.out.println("Number: " + a + "" + c + "" + b);
            String ReverseNumber = (Number.charAt(2) + "" + Number.charAt(1) + "" + Number.charAt(0));
            int NumberInt =  Integer.parseInt(Number);
            int ReverseNumberInt = Integer.parseInt(ReverseNumber);
            if (NumberInt > ReverseNumberInt)
            {
                int Difference = (NumberInt - ReverseNumberInt);
                System.out.println(Number + " - " + ReverseNumber + " = " + Difference);
                String DifferenceString = Integer.toString(Difference);
                String ReverseDifference = (DifferenceString.charAt(2) + "" + DifferenceString.charAt(1) + "" + DifferenceString.charAt(0));
                int ReverseDifferenceInt = Integer.parseInt(ReverseDifference);
                int AddedDifferences = (ReverseDifferenceInt +  Difference);
                String AddedDifferencesString = Integer.toString(AddedDifferences);
                System.out.println(DifferenceString + " + " + ReverseDifference + " = " +  AddedDifferencesString);
            } else {
                int Difference = (ReverseNumberInt - NumberInt);
                System.out.println(ReverseNumber + " - " + Number + " = " + Difference);
                String DifferenceString = Integer.toString(Difference);
                String ReverseDifference = (DifferenceString.charAt(2) + "" + DifferenceString.charAt(1) + "" + DifferenceString.charAt(0));
                int ReverseDifferenceInt = Integer.parseInt(ReverseDifference);
                int AddedDifferences = (ReverseDifferenceInt + Difference);
                String AddedDifferencesString = Integer.toString(AddedDifferences);
                System.out.println(DifferenceString + " + " + ReverseDifference + " = " + AddedDifferencesString);
            }
        } else {
            String Number = (c + "" + a + "" + b);
            System.out.println("Number: " + c + "" + a + "" + b);
            String ReverseNumber = (Number.charAt(2) + "" + Number.charAt(1) + "" + Number.charAt(0));
            int NumberInt =  Integer.parseInt(Number);
            int ReverseNumberInt = Integer.parseInt(ReverseNumber);
            if (NumberInt > ReverseNumberInt)
            {
                int Difference = (NumberInt - ReverseNumberInt);
                System.out.println(Number + " - " + ReverseNumber + " = " + Difference);
                String DifferenceString = Integer.toString(Difference);
                String ReverseDifference = (DifferenceString.charAt(2) + "" + DifferenceString.charAt(1) + "" + DifferenceString.charAt(0));
                int ReverseDifferenceInt = Integer.parseInt(ReverseDifference);
                int AddedDifferences = (ReverseDifferenceInt +  Difference);
                String AddedDifferencesString = Integer.toString(AddedDifferences);
                System.out.println(DifferenceString + " + " + ReverseDifference + " = " +  AddedDifferencesString);
            } else {
                int Difference = (ReverseNumberInt - NumberInt);
                System.out.println(ReverseNumber + " - " + Number + " = " + Difference);
                String DifferenceString = Integer.toString(Difference);
                String ReverseDifference = (DifferenceString.charAt(2) + "" + DifferenceString.charAt(1) + "" + DifferenceString.charAt(0));
                int ReverseDifferenceInt = Integer.parseInt(ReverseDifference);
                int AddedDifferences = (ReverseDifferenceInt + Difference);
                String AddedDifferencesString = Integer.toString(AddedDifferences);
                System.out.println(DifferenceString + " + " + ReverseDifference + " = " + AddedDifferencesString);
            }
        }
    }
}
