package Enum;


public class SwitchEnum {
    public enum Months {
        Jan, Feb, Mar, Apr, May, June, July, Aug, Sept, Oct, Nov, Dec;

    }

    public static void main(String[] args) {

    }

    public class Main {
        public static void main(String[] args) {


            Day day = Day.WEDNESDAY;
            // new Syntax Switch in java 12
            String res = switch (day) {
                case MONDAY -> "M";
                case THURSDAY -> "T";
                default -> "Weekend";
            };
            System.out.println(res);
            System.out.println(Months.Jan);
        }
    }
}




















































































